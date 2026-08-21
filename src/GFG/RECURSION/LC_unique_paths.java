package GFG.RECURSION;
public class LC_unique_paths { /*only right and down are allowed to reach dest.*/

//?better solution:-
    public static int pathMethod1(int m, int n){ /*Grid Problem Statement- Method 1 TWO PARAMETERS*/
        if(m==1 || n==1) return 1; //agar corner pe aagye toh fir ek hi way hogs. only 1 dir..
        return pathMethod1(m-1,n)+pathMethod1(m,n-1);
    }

//current row column(0,0), last row column(m,n).
    public static int pathMethod2(int cr, int cc, int lr, int lc){/*Method 2 Starting to Target*/
        if(cr==lr && cc==lc) return 1;
        if(cr>lr && cc>lc) return 0; /*!IMPORTANT*/ //FOR OUT OF BOUND.

        int right=pathMethod2(cr,cc+1,lr,lc);
        int down=pathMethod2(cr+1,cc,lr,lc);
        return right+down;
    }
}
