package com.danahr.development.ottoeventbus_x;

import com.squareup.otto.Bus;

public class OttoBus {

    private static Bus sBus;

    public static Bus getBus() {
        if (sBus == null)
            sBus = new Bus();
        return sBus;
    }
}