/**
 * Created by jamesbaloney on 2017/7/6.
 */

import java.util.*;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static String strin;
    static ArrayList cacu = new ArrayList<>();
    static ArrayList<String> cal = new ArrayList<>();

    public static void main(String[] args) {
        strin = sc.next();
        int n = 0;
        int m = 0;
        for (int y = 0; y < strin.length(); y++) {
            if (strin.charAt(y) == '+' || strin.charAt(y) == '-' || strin.charAt(y) == '*' || strin.charAt(y) == '/' || strin.charAt(y) == '(' || strin.charAt(y) == ')') {
                cacu.add(strin.charAt(y));
                cal.add(strin.substring(n, m));
                m = y + 1;
                n = y + 1;
            } else {
                m += 1;

            }
        }
        cal.add(strin.substring(n, m));
        System.out.println("1:" + cacu);
        System.out.println("1:" + cal);
        for (int h = 0; h < cal.size(); h++) {
            if (cal.get(h).equals("")) {
                cal.remove(h);
            }
        }
        System.out.println("2:" + cacu);
        System.out.println("2:" + cal);
        int check1, check2;
        check1 = cacu.indexOf('(');
        check2 = cacu.indexOf(')');
        if (check1 != -1) {
            cacu.remove(check1);
            cacu.remove(check2 - 1);
            for (int u = check1; u < check2 - 1; u++) {
                if (cacu.size() != 0) {
                    String det = String.valueOf(cacu.get(u));
                    if (det.equals("*")) {
                        Float x;
                        Float c;
                        float l;
                        x = Float.valueOf(cal.get(u));
                        c = Float.valueOf(cal.get(u + 1));
                        l = x * c;
                        cal.remove(u + 1);
                        cacu.remove(u);
                        cal.set(u, String.valueOf(l));
                        System.out.println("seikou1");
                        u = -1;

                    } else if (det.equals("/")) {
                        float x, c, l;
                        x = Float.valueOf(cal.get(u));
                        c = Float.valueOf(cal.get(u + 1));
                        l = x / c;
                        cal.remove(u + 1);
                        cacu.remove(u);
                        cal.set(u, String.valueOf(l));
                        System.out.println("seikou");
                        u = -1;
                    }
                }
            }

            for (int k = check1; k < check2 - 1; k++) {
                if (cacu.size() != 0) {
                    String det = String.valueOf(cacu.get(k));
                    if (det.equals("+")) {
                        System.out.println("seikou1");
                        Float x;
                        Float c;
                        float l;
                        x = Float.valueOf(cal.get(k));
                        c = Float.valueOf(cal.get(k + 1));
                        l = x + c;
                        cal.remove(k + 1);
                        cacu.remove(k);
                        cal.set(k, String.valueOf(l));
                        k = -1;
                    } else if (det.equals("-")) {
                        System.out.println("seikou1");
                        Float x;
                        Float c;
                        float l;
                        x = Float.valueOf(cal.get(k));
                        c = Float.valueOf(cal.get(k + 1));
                        l = x - c;
                        cal.remove(k + 1);
                        cacu.remove(k);
                        cal.set(k, String.valueOf(l));
                        k = -1;
                    } else {
                        break;
                    }
                }
            }
        }
            for (int u = 0; u < cacu.size(); u++) {

                String det = String.valueOf(cacu.get(u));
                if (det.equals("*")) {
                    Float x;Float c;
                    float l;
                    x = Float.valueOf(cal.get(u));
                    c = Float.valueOf(cal.get(u + 1));
                    l = x * c;
                    cal.remove(u + 1);
                    cacu.remove(u);
                    cal.set(u, String.valueOf(l));
                    System.out.println("seikou");
                    u = -1;
                } else if (det.equals("/")) {
                    float x, c, l;
                    x = Float.valueOf(cal.get(u));
                    c = Float.valueOf(cal.get(u + 1));
                    l = x / c;
                    cal.remove(u + 1);
                    cacu.remove(u);
                    cal.set(u, String.valueOf(l));
                    System.out.println("seikou");
                    u = -1;
                }
            }


        for (int k = 0; k < cacu.size(); k++) {
            String det = String.valueOf(cacu.get(k));
            if (det.equals("+")) {
                System.out.println("seikou");
                Float x;Float c;
                float l;
                x = Float.valueOf(cal.get(k));
                c = Float.valueOf(cal.get(k + 1));
                l = x + c;
                cal.remove(k + 1);
                cacu.remove(k);
                cal.set(k, String.valueOf(l));
                k = -1;
            } else if (det.equals("-")) {
                System.out.println("seikou");
                Float x;Float c;
                float l;
                x = Float.valueOf(cal.get(k));
                c = Float.valueOf(cal.get(k + 1));
                l = x - c;
                cal.remove(k + 1);
                cacu.remove(k);
                cal.set(k, String.valueOf(l));
                k = -1;
            }
        }


        System.out.println(cal);
    }


}


