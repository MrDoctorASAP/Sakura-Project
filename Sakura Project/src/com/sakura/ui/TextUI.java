package com.sakura.ui;

/**
 * Console user interface
 * Implementation of the interface allows
 * the component to be a console user interface,
 * with the ability to read and show String.
 * @see Reader
 * @see Writer
 * */
public interface TextUI extends Reader<String>, Printer<String> { }
