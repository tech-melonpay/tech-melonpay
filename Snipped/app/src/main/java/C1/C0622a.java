package c1;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;

/* compiled from: MasterKeys.java */
/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622a {

    /* renamed from: a, reason: collision with root package name */
    public static final KeyGenParameterSpec f8509a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
