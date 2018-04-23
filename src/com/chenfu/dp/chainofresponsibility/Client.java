package com.chenfu.dp.chainofresponsibility;

public class Client {
    public static void main(String[] args) {

        FilterChain filterChain  = new FilterChain();
        HtmlFilter htmlFilter = new HtmlFilter();
        SensitiveFilter sensitiveFilter = new SensitiveFilter();
        filterChain.addFilter(htmlFilter).addFilter(sensitiveFilter);
        Request request = new Request();
        Response response = new Response();
        request.setRequestStr("request <敏感/br> <html>request");
        response.setResponseStr("response response");
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());

    }
}
