package com.sumsub.sns.internal.log;

/* loaded from: classes2.dex */
public final class c {
    public static final String a(Object obj) {
        if (obj.getClass().isAnonymousClass()) {
            String name = obj.getClass().getName();
            return name.length() <= 23 ? name : name.substring(name.length() - 23, name.length());
        }
        String simpleName = obj.getClass().getSimpleName();
        return simpleName.length() <= 23 ? simpleName : simpleName.substring(0, 23);
    }
}
