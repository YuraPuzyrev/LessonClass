package org.itstep.runner;

import org.itstep.lessons.Cens;

public class RunnerCens {
    public static void main(String[] args) {
        Cens cens = new Cens();
        String a = cens.Zam("Cейчас бы шпика солёного", "цензура", "шпика");
        System.out.println(a);
    }
}
