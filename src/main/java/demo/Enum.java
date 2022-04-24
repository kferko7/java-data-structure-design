package demo;

public class Enum {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;

        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}
/*
is a special data type that enables for a variable to be set of predefined constants
Because they are constants, the names of an enum type's fields are in uppercase letters.
You should use enum types any time you need to represent a fixed set of constants.


 */