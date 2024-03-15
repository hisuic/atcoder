import java.util.*;

public class c001 {
    public static void main(String[] args) {
        Scanner getval = new Scanner(System.in);
        int Deg = getval.nextInt();
        float Dis = getval.nextFloat();
        float Dis_m = Math.round((Dis / 60) * 100) / 100f;

        String Deg_o = getDir(Deg);
        int W = getW(Dis_m);
        if (W == 0)
            Deg_o = "C";

        Output(Deg_o, W);
    }

    static String getDir(int deg) {
        if (112 <= deg && deg < 337) {
            return "NNE";
        } else if (337 <= deg && deg < 562) {
            return "NE";
        } else if (562 <= deg && deg < 787) {
            return "ENE";
        } else if (787 <= deg && deg < 1012) {
            return "E";
        } else if (1012 <= deg && deg < 1237) {
            return "ESE";
        } else if (1237 <= deg && deg < 1462) {
            return "SE";
        } else if (1462 <= deg && deg < 1687) {
            return "SSE";
        } else if (1687 <= deg && deg < 1912) {
            return "S";
        } else if (1912 <= deg && deg < 2137) {
            return "SSW";
        } else if (2137 <= deg && deg < 2362) {
            return "SW";
        } else if (2362 <= deg && deg < 2587) {
            return "WSW";
        } else if (2587 <= deg && deg < 2812) {
            return "W";
        } else if (2812 <= deg && deg < 3037) {
            return "WNW";
        } else if (3037 <= deg && deg < 3262) {
            return "NW";
        } else if (3262 <= deg && deg < 3487) {
            return "NNW";
        } else {
            return "N";
        }
    }

    static int getW(float dis) {
        if (0 <= dis && dis <= 0.2) {
            return 0;
        } else if (0.3 <= dis && dis <= 1.5) {
            return 1;
        } else if (1.6 <= dis && dis <= 3.3) {
            return 2;
        } else if (3.4 <= dis && dis <= 5.4) {
            return 3;
        } else if (5.5 <= dis && dis <= 7.9) {
            return 4;
        } else if (8.0 <= dis && dis <= 10.7) {
            return 5;
        } else if (10.8 <= dis && dis <= 13.8) {
            return 6;
        } else if (13.9 <= dis && dis <= 17.1) {
            return 7;
        } else if (17.2 <= dis && dis <= 20.7) {
            return 8;
        } else if (20.8 <= dis && dis <= 24.4) {
            return 9;
        } else if (24.5 <= dis && dis <= 28.4) {
            return 10;
        } else if (28.5 <= dis && dis <= 32.6) {
            return 11;
        } else if (32.7 <= dis) {
            return 12;
        } else {
            return 0;
        }
    }

    static void Output(String Dir, int W) {
        System.out.println(Dir + "\n" + W);
    }
}
