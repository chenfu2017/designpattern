package com.chenfu.dp.ChainOfResponsibility;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {

        request.setRequestStr(request.getRequestStr().replace(" ", "%20")
                .replace("敏感", "") + "---SesitiveFilter()");
        chain.doFilter(request, response, chain);
        response.setResponseStr(response.getResponseStr()+ "---SesitiveFilter()");
    }
}
