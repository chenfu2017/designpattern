package com.chenfu.dp.chainofresponsibility;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
