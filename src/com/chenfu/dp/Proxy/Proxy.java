package com.chenfu.dp.Proxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception {
		String methodStr = "";
		String rt = "\r\n";
		Method[] methods = infce.getMethods();
		for(Method m : methods) {
			methodStr += "@Override" + rt + 
						 "    public void " + m.getName() + "() {" + rt +
						 "           try {" + rt +
						 "           Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
						 "           h.invoke(this, md);" + rt +
						 "           }catch(Exception e) {"+ rt +
					     "       	  e.printStackTrace();"+rt+
						 "     }" + rt +
						 "   }"+rt;
		}
		
		String src = 
			"package com.chenfu.dp.Proxy;" +  rt +
			"import java.lang.reflect.Method;" + rt +

			"public class $Proxy1 implements " + infce.getName() + "{" + rt +
		    "private com.chenfu.dp.Proxy.InvocationHandler h;" + rt +
			"    public $Proxy1(InvocationHandler h) {" + rt +
			"        this.h = h;" + rt +
			"    }" + rt +

			methodStr +
			"}";
		String fileName =
				System.getProperty("user.dir")+"/src/com/chenfu/dp/Proxy/$Proxy1.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();

		URL[] urls = new URL[] {new URL("file:/" +System.getProperty("user.dir")+"/src/com/chenfu/dp/Proxy/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.chenfu.dp.Proxy.$Proxy1");
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		Object m = ctr.newInstance(h);
		return m;
	}
}
