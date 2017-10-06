package Lesson13;

/**
 * Created by Админ on 25.09.2017.
 */
public class Numbers {
    public static void main(String[] args) {
        String g;
        String k;
        String m;
        int z=168;
        int a=-53;
        int s=3;
        int b=59;
        int f=56;
        StringBuilder pd = new StringBuilder(40);
        g=pd.append(s).append("+").append(f).append("=").append(b).toString();
        StringBuilder pt = new StringBuilder(40);
        k=pt.append(s).append("-").append(f).append("=").append(a).toString();
        StringBuilder ps = new StringBuilder(40);
        m=ps.append(s).append("*").append(f).append("=").append(z).toString();
        System.out.println(g);
        System.out.println(k);
        System.out.println(m);
    }
}
