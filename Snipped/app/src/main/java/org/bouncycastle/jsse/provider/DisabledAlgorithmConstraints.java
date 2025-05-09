package org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

/* loaded from: classes.dex */
class DisabledAlgorithmConstraints extends AbstractAlgorithmConstraints {
    private final Set<String> disabledAlgorithms;

    private DisabledAlgorithmConstraints(AlgorithmDecomposer algorithmDecomposer, Set<String> set) {
        super(algorithmDecomposer);
        this.disabledAlgorithms = set;
    }

    private boolean checkConstraints(Set<BCCryptoPrimitive> set, String str, Key key, AlgorithmParameters algorithmParameters) {
        checkPrimitives(set);
        checkKey(key);
        return (!isAlgorithmSpecified(str) || permits(set, str, algorithmParameters)) && permits(set, key.getAlgorithm(), null);
    }

    public static DisabledAlgorithmConstraints create(AlgorithmDecomposer algorithmDecomposer, String str, String str2) {
        String[] stringArraySecurityProperty = PropertyUtils.getStringArraySecurityProperty(str, str2);
        if (stringArraySecurityProperty == null) {
            return null;
        }
        return new DisabledAlgorithmConstraints(algorithmDecomposer, AbstractAlgorithmConstraints.asUnmodifiableSet(stringArraySecurityProperty));
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public final boolean permits(Set<BCCryptoPrimitive> set, String str, AlgorithmParameters algorithmParameters) {
        checkPrimitives(set);
        checkAlgorithmName(str);
        return !containsAnyPartIgnoreCase(this.disabledAlgorithms, str);
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public final boolean permits(Set<BCCryptoPrimitive> set, String str, Key key, AlgorithmParameters algorithmParameters) {
        checkAlgorithmName(str);
        return checkConstraints(set, str, key, algorithmParameters);
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public final boolean permits(Set<BCCryptoPrimitive> set, Key key) {
        return checkConstraints(set, "", key, null);
    }
}
