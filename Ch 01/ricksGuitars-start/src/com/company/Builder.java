package com.company;

public enum Builder {
    // set of allowed values
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;

    // define toString()
    public String toString() {
        switch (this) {
            case FENDER:
                return "Fender";
            case ANY:
                return "Any";
            case PRS:
                return "Prs";
            case RYAN:
                return "Ryan";
            case OLSON:
                return "Olson";
            case GIBSON:
                return "Gibson";
            case MARTIN:
                return "Martin";
            case COLLINGS:
                return "Collings";
            default:
                return "Unspecified";
        }
    }
}
