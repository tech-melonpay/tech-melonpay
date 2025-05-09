package org.bouncycastle.jsse.provider;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.CryptoPrimitive;
import java.security.Key;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

/* loaded from: classes.dex */
abstract class JsseUtils_7 extends JsseUtils {
    static final Set<CryptoPrimitive> TLS_CRYPTO_PRIMITIVES = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT));

    /* renamed from: org.bouncycastle.jsse.provider.JsseUtils_7$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$security$CryptoPrimitive;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive;

        static {
            int[] iArr = new int[CryptoPrimitive.values().length];
            $SwitchMap$java$security$CryptoPrimitive = iArr;
            try {
                iArr[CryptoPrimitive.MESSAGE_DIGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.SECURE_RANDOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.BLOCK_CIPHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.STREAM_CIPHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.MAC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.KEY_WRAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.PUBLIC_KEY_ENCRYPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.SIGNATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.KEY_ENCAPSULATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$security$CryptoPrimitive[CryptoPrimitive.KEY_AGREEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[BCCryptoPrimitive.values().length];
            $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive = iArr2;
            try {
                iArr2[BCCryptoPrimitive.MESSAGE_DIGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.SECURE_RANDOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.BLOCK_CIPHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.STREAM_CIPHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.MAC.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.KEY_WRAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.PUBLIC_KEY_ENCRYPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.SIGNATURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.KEY_ENCAPSULATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[BCCryptoPrimitive.KEY_AGREEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static class ExportAlgorithmConstraints implements AlgorithmConstraints {
        private final BCAlgorithmConstraints constraints;

        public ExportAlgorithmConstraints(BCAlgorithmConstraints bCAlgorithmConstraints) {
            this.constraints = bCAlgorithmConstraints;
        }

        @Override // java.security.AlgorithmConstraints
        public boolean permits(Set<CryptoPrimitive> set, String str, AlgorithmParameters algorithmParameters) {
            return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(set), str, algorithmParameters);
        }

        public BCAlgorithmConstraints unwrap() {
            return this.constraints;
        }

        @Override // java.security.AlgorithmConstraints
        public boolean permits(Set<CryptoPrimitive> set, String str, Key key, AlgorithmParameters algorithmParameters) {
            return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(set), str, key, algorithmParameters);
        }

        @Override // java.security.AlgorithmConstraints
        public boolean permits(Set<CryptoPrimitive> set, Key key) {
            return this.constraints.permits(JsseUtils_7.importCryptoPrimitives(set), key);
        }
    }

    public static class ImportAlgorithmConstraints implements BCAlgorithmConstraints {
        private final AlgorithmConstraints constraints;

        public ImportAlgorithmConstraints(AlgorithmConstraints algorithmConstraints) {
            this.constraints = algorithmConstraints;
        }

        @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
        public boolean permits(Set<BCCryptoPrimitive> set, String str, AlgorithmParameters algorithmParameters) {
            return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(set), str, algorithmParameters);
        }

        public AlgorithmConstraints unwrap() {
            return this.constraints;
        }

        @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
        public boolean permits(Set<BCCryptoPrimitive> set, String str, Key key, AlgorithmParameters algorithmParameters) {
            return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(set), str, key, algorithmParameters);
        }

        @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
        public boolean permits(Set<BCCryptoPrimitive> set, Key key) {
            return this.constraints.permits(JsseUtils_7.exportCryptoPrimitives(set), key);
        }
    }

    public static Object exportAlgorithmConstraints(BCAlgorithmConstraints bCAlgorithmConstraints) {
        if (bCAlgorithmConstraints == null) {
            return null;
        }
        return bCAlgorithmConstraints instanceof ImportAlgorithmConstraints ? ((ImportAlgorithmConstraints) bCAlgorithmConstraints).unwrap() : new ExportAlgorithmConstraints(bCAlgorithmConstraints);
    }

    public static CryptoPrimitive exportCryptoPrimitive(BCCryptoPrimitive bCCryptoPrimitive) {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$jsse$java$security$BCCryptoPrimitive[bCCryptoPrimitive.ordinal()]) {
            case 1:
                return CryptoPrimitive.MESSAGE_DIGEST;
            case 2:
                return CryptoPrimitive.SECURE_RANDOM;
            case 3:
                return CryptoPrimitive.BLOCK_CIPHER;
            case 4:
                return CryptoPrimitive.STREAM_CIPHER;
            case 5:
                return CryptoPrimitive.MAC;
            case 6:
                return CryptoPrimitive.KEY_WRAP;
            case 7:
                return CryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
            case 8:
                return CryptoPrimitive.SIGNATURE;
            case 9:
                return CryptoPrimitive.KEY_ENCAPSULATION;
            case 10:
                return CryptoPrimitive.KEY_AGREEMENT;
            default:
                return null;
        }
    }

    public static Set<CryptoPrimitive> exportCryptoPrimitives(Set<BCCryptoPrimitive> set) {
        if (JsseUtils.TLS_CRYPTO_PRIMITIVES_BC == set) {
            return TLS_CRYPTO_PRIMITIVES;
        }
        HashSet hashSet = new HashSet();
        Iterator<BCCryptoPrimitive> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(exportCryptoPrimitive(it.next()));
        }
        return hashSet;
    }

    public static BCAlgorithmConstraints importAlgorithmConstraints(Object obj) {
        if (obj == null) {
            return null;
        }
        AlgorithmConstraints algorithmConstraints = (AlgorithmConstraints) obj;
        return algorithmConstraints instanceof ExportAlgorithmConstraints ? ((ExportAlgorithmConstraints) algorithmConstraints).unwrap() : new ImportAlgorithmConstraints(algorithmConstraints);
    }

    public static BCCryptoPrimitive importCryptoPrimitive(CryptoPrimitive cryptoPrimitive) {
        switch (AnonymousClass1.$SwitchMap$java$security$CryptoPrimitive[cryptoPrimitive.ordinal()]) {
            case 1:
                return BCCryptoPrimitive.MESSAGE_DIGEST;
            case 2:
                return BCCryptoPrimitive.SECURE_RANDOM;
            case 3:
                return BCCryptoPrimitive.BLOCK_CIPHER;
            case 4:
                return BCCryptoPrimitive.STREAM_CIPHER;
            case 5:
                return BCCryptoPrimitive.MAC;
            case 6:
                return BCCryptoPrimitive.KEY_WRAP;
            case 7:
                return BCCryptoPrimitive.PUBLIC_KEY_ENCRYPTION;
            case 8:
                return BCCryptoPrimitive.SIGNATURE;
            case 9:
                return BCCryptoPrimitive.KEY_ENCAPSULATION;
            case 10:
                return BCCryptoPrimitive.KEY_AGREEMENT;
            default:
                return null;
        }
    }

    public static Set<BCCryptoPrimitive> importCryptoPrimitives(Set<CryptoPrimitive> set) {
        if (TLS_CRYPTO_PRIMITIVES == set) {
            return JsseUtils.TLS_CRYPTO_PRIMITIVES_BC;
        }
        HashSet hashSet = new HashSet();
        Iterator<CryptoPrimitive> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(importCryptoPrimitive(it.next()));
        }
        return hashSet;
    }
}
