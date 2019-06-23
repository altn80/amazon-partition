/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.amazon.partition.shoppers;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andre
 */
public class Partition {

    public static List<String> partition(String string) {
        String lista = "";
        char[] array = string.toCharArray();
        lista += toString(array[0]) + "#";
        for (int i = 1; i < array.length; i++) {
            if (lista.contains(toString(array[i]))) {
                lista = lista.substring(0, lista.indexOf(toString(array[i])))
                        + lista.substring(lista.indexOf(toString(array[i])), lista.length()).replaceAll("#", "")
                        + toString(array[i]) + "#";
            } else {
                lista += toString(array[i]) + "#";
            }
        }
        return Arrays.asList(lista);
    }

    private static String toString(char c) {
        return new String(new char[]{c});
    }

    public static void main(String[] args) {
        System.out.println(partition("abcdefpqrsptxyzzx"));
    }

}