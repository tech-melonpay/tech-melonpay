package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class ECBasisType {
    public static final short ec_basis_pentanomial = 2;
    public static final short ec_basis_trinomial = 1;

    public static boolean isValid(short s10) {
        return s10 >= 1 && s10 <= 2;
    }
}
