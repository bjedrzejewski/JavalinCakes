package com.e4developer.javalincakes;

import io.javalin.http.Context;

public final class CakesController {

    private CakesController(){ }

    static String[] availableCakes = {"carrot cake", "chocolate cake", "cheesecake"};

    public static void getAllCakes(Context ctx) {
        ctx.json(availableCakes);
    }

    public static void getSpecialCake(Context ctx) {
        for(String cake : availableCakes){
            if(cake.contains(ctx.pathParam("special"))){
                ctx.result(cake);
                return;
            }
        }
        ctx.result("No Cake :(");
    }
}
