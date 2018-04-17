package com.chenfu.dp.ChainOfResponsibility;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
