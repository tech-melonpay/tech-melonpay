package org.ejbca.cvc;

/* loaded from: classes3.dex */
public enum AuthorizationRoleEnum implements AuthorizationRole {
    CVCA(192),
    DV_D(128),
    DV_F(64),
    IS(0);

    private byte value;

    /* renamed from: org.ejbca.cvc.AuthorizationRoleEnum$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum;

        static {
            int[] iArr = new int[AuthorizationRoleEnum.values().length];
            $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum = iArr;
            try {
                iArr[AuthorizationRoleEnum.CVCA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum[AuthorizationRoleEnum.DV_D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum[AuthorizationRoleEnum.DV_F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum[AuthorizationRoleEnum.IS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AuthorizationRoleEnum(int i) {
        this.value = (byte) i;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public byte getValue() {
        return this.value;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isAccreditationBodyDV() {
        return false;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isAuthenticationTerminal() {
        return false;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isCVCA() {
        return this == CVCA;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isCertificationServiceProviderDV() {
        return false;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isDV() {
        return this == DV_D || this == DV_F;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isDomesticDV() {
        return this == DV_D;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isForeignDV() {
        return this == DV_F;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isIS() {
        return this == IS;
    }

    @Override // org.ejbca.cvc.AuthorizationRole
    public boolean isSignatureTerminal() {
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$org$ejbca$cvc$AuthorizationRoleEnum[ordinal()];
        if (i == 1) {
            return "CVCA";
        }
        if (i == 2) {
            return "DV-domestic";
        }
        if (i == 3) {
            return "DV-foreign";
        }
        if (i == 4) {
            return "IS";
        }
        throw new IllegalStateException("Enum case not handled");
    }
}
