/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AVAJANG
 */
public class BigInt {

    protected ArrayList<Integer> n = new ArrayList<Integer>();

    public int size() {
        return n.size();
    }

    public void add(Integer x) {
        n.add(x);
    }

    public void add(int index, Integer x) {
        n.add(index, x);
    }

    private int compare(BigInt n1, BigInt n2) {
        int bigger = 0;
        int size;
        n1.makeCorrect();
        n2.makeCorrect();

        if (n1.size() > n2.size()) {
            return 1;
        } else if (n1.size() < n2.size()) {
            return -1;
        } else {
            size = n2.size();

            for (int i = 0; i < size; i++) {
                if (n1.n.get(i) > n2.n.get(i)) {
                    bigger = 1;
                    break;
                } else if (n1.n.get(i) < n2.n.get(i)) {
                    bigger = -1;
                    break;
                } else {
                    continue;
                }
            }
        }
        return bigger;
    }

    private void makeCorrect() {
        while (!this.n.isEmpty() && this.n.get(0).equals(0)) {
            this.n.remove(0);
        }
        if (this.n.isEmpty()) {
            this.n.add(0, 0);
        }
    }

    private boolean isZero() {
        boolean yes = true;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).equals(0)) {
                System.out.println(n.get(i) + " 0 hast");
                continue;
            } else {
                return false;
            }
        }
        return yes;
    }

    private boolean isEmpty() {
        if (n.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public BigInt power(int m) throws Exception {
        BigInt p = new BigInt();
        p.n.add(1);
        for (int i = 0; i < m; i++) {
            p = multy(p, this);
        }
        return p;
    }

    public BigInt division(BigInt n1, BigInt n2) throws Exception {
        if (n2.size() == 1 && n2.n.get(0).equals(1)) {
            return n1;
        } else if (n2.isZero()) {
            JOptionPane.showMessageDialog(null, "مقسوم علیه نباید 0 باشد");
            BigInt n3 = new BigInt();
            n3.add(0);
            return n3;

        } else if (compare(n1, n2) == -1) {
            BigInt n3 = new BigInt();
            n3.add(0);
            return n3;
        } else {
            BigInt n3 = new BigInt();
            BigInt temp = new BigInt();
            
            
            
            /////////////
            while (!n1.isEmpty()) {
                temp.n.add(n1.n.get(0));
                n1.n.remove(0);
                
                int k = 1;
                while (compare(temp, n2) >= 0) {

                    temp = subtraction(temp, n2);
                    while (n2.n.get(0).equals(0)) {
                        n2.n.remove(0);
                    }
                    while (!temp.isEmpty() && temp.n.get(0).equals(0)) {
                        temp.n.remove(0);
                    }
                    if (temp.isEmpty()) {
                        temp.n.add(0, 0);
                    }

                    k++;
                }
                n3.n.add(k - 1);

                temp.makeCorrect();
                
                
            }
            n3.makeCorrect();
            return n3;
        }
    }

    public BigInt modulo(BigInt n1, BigInt n2) throws Exception {
        BigInt n3 = new BigInt();
        BigInt temp = new BigInt();
        int f = 1;
        int m;
        if (n2.isZero()) {
            JOptionPane.showMessageDialog(null, "مقسوم علیه نباید 0 باشد");
            n3.add(0);
            return n3;
        } else {
            while (!n1.isEmpty() && n1.size() >= n2.size()) {
                m = 1;
                while (!n1.isEmpty() && m <= n2.size()) {
                    temp.n.add(n1.n.get(0));
                    n1.n.remove(0);
                    m++;

                }
                if (compare(n2, temp) == 1) {

                    if (!n1.isEmpty()) {
                        temp.n.add(n1.n.get(0));
                        n1.n.remove(0);
                        if (f != 1) {
                            n3.add(0);
                        }
                    }
                }

                int k = 1;
                while (compare(temp, n2) >= 0) {

                    temp = subtraction(temp, n2);
                    while (n2.n.get(0).equals(0)) {
                        n2.n.remove(0);
                    }
                    while (!temp.isEmpty() && temp.n.get(0).equals(0)) {
                        temp.n.remove(0);
                    }
                    if (temp.isEmpty()) {
                        temp.n.add(0, 0);
                    }

                    k++;
                }
                n3.n.add(k - 1);

                temp.makeCorrect();
                f++;
            }
            while (!n1.isEmpty() && n1.n.get(0).equals(0)) {
                n3.n.add(n1.n.get(0));
                n1.n.remove(0);
            }
            return temp;
        }
    }

    public BigInt subtraction(BigInt n1, BigInt n2) throws Exception {

        boolean neg;
        if (compare(n1, n2) >= 0) {
            neg = false;
        } else {
            neg = true;
            BigInt t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n1.size() != n2.size()) {
            while (n1.size() != n2.size()) {
                n2.n.add(0, 0);
            }
        }
        BigInt n3 = new BigInt();

        for (int i = n1.size() - 1; i >= 0; i--) {
            if (n1.n.get(i) < n2.n.get(i)) {

                n1.n.set(i, n1.n.get(i) + 10);
                n1.n.set(i - 1, n1.n.get(i - 1) - 1);
            }

            n3.n.add(0, n1.n.get(i) - n2.n.get(i));

        }
        //check is 0 or no///
        while (n3.isEmpty() == false && n3.n.get(0).equals(0)) {
            n3.n.remove(0);
        }
        if (n3.isEmpty()) {
            n3.n.add(0);
        }
        if (neg) {
            n3.n.set(0, n3.n.get(0) * -1);
        }
        return n3;
    }

    public BigInt multy(BigInt n1, BigInt n2) throws Exception {
        n1.makeCorrect();
        n2.makeCorrect();
        if (n1.size() < n2.size()) {
            BigInt t = n1;
            n1 = n2;
            n2 = t;
        }

        BigInt n3 = new BigInt();
        BigInt s = new BigInt();
        s.n.add(0);
        int temp = 0;
        int m;
        for (int i = n2.size() - 1; i >= 0; i--) {
            for (int k = 0; k < n2.size() - i - 1; k++) {
                n3.n.add(0, 0);
            }

            for (int j = n1.size() - 1; j >= 0; j--) {
                m = n1.n.get(j) * n2.n.get(i) + temp;
                n3.n.add(0, m % 10);
                temp = m / 10;
            }
            if (temp != 0) {
                n3.n.add(0, temp);
            }
            s = addition(s, n3);
            n3.n.clear();
            temp = 0;
        }

        return s;
    }

    public BigInt addition(BigInt n1, BigInt n2) throws Exception {

        if (n1.size() < n2.size()) {
            BigInt t = n1;
            n1 = n2;
            n2 = t;
        }

        if (n1.size() != n2.size()) {
            while (n1.size() != n2.size()) {
                n2.n.add(0, 0);
            }
        }

        BigInt n3 = new BigInt();
        int temp = 0;
        int m;
        for (int i = n1.size() - 1; i >= 0; i--) {
            m = n1.n.get(i) + n2.n.get(i) + temp;
            n3.n.add(0, m % 10);
            temp = m / 10;

        }
        if (temp != 0) {
            n3.n.add(0, temp);
        }
        return n3;
    }
}
