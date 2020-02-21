package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int vc_big = 0;
        int tt_big = 0;
        String lat = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String vowels = "eyuioaEYUIOA";
        String consonants = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
        char let[] = lat.toCharArray();
        char cons_let[] = vowels.toCharArray();
        char vow_let[] = consonants.toCharArray();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            char let_tmp[] = words[i].toCharArray();
            int tt = 0;
            for (int j = 0; j < let_tmp.length; j++)
            {
                int t = 0;
                for (int k = 0; k < let.length; k++)
                {
                    if (let[k] == let_tmp[j])
                    {
                        t = 1;
                    }
                }
                tt += t;
            }
            if (tt == words[i].length())
            {
                // нашли латинское слово - счиатем гл согл
                tt_big++;

                int vc = 0;
                int cc = 0;

                // считаем согласные
                for (int j = 0; j < let_tmp.length; j++)
                {
                    int t = 0;
                    for (int k = 0; k < cons_let.length; k++)
                    {
                        if (cons_let[k] == let_tmp[j])
                        {
                            t = 1;
                        }
                    }
                    cc += t;
                }

                // считаем гласные
                for (int j = 0; j < let_tmp.length; j++)
                {
                    int t = 0;
                    for (int k = 0; k < vow_let.length; k++)
                    {
                        if (vow_let[k] == let_tmp[j])
                        {
                            t = 1;
                        }
                    }
                    vc += t;
                }

                // + слов с совпадением
                if (vc == cc)
                {
                    vc_big++;
                }


            }

        }

        System.out.println("Latin: " + tt_big + "; vowels=consonants " + vc_big);

    }

}