package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class FieldNamingPolicy implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final FieldNamingPolicy f10304a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FieldNamingPolicy[] f10305b;

    static {
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.1
            @Override // com.google.gson.b
            public final String a(Field field) {
                return field.getName();
            }
        };
        f10304a = fieldNamingPolicy;
        f10305b = new FieldNamingPolicy[]{fieldNamingPolicy, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.2
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.d(field.getName());
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.3
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.d(FieldNamingPolicy.c(field.getName(), ' '));
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.4
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.5
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.6
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.7
            @Override // com.google.gson.b
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public FieldNamingPolicy() {
        throw null;
    }

    public static String c(String str, char c2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String d(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) f10305b.clone();
    }
}
