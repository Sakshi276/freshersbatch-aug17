package com.practice.lambda;


@FunctionalInterface 
public interface Filter<T> {

	boolean test(T t);
}
