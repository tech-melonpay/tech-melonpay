package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class K {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            ByteString byteString = ByteString.f10084b;
            sb2.append(c0.a(new ByteString.LiteralByteString(((String) obj).getBytes(C0673u.f10266a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(c0.a((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i + 2);
            sb2.append("\n");
            while (i9 < i) {
                sb2.append(' ');
                i9++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        while (i9 < i) {
            sb2.append(' ');
            i9++;
        }
        sb2.append("}");
    }

    public static void c(I i, StringBuilder sb2, int i9) {
        boolean z10;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : i.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb2, i9, a(str2), GeneratedMessageLite.m(method2, i, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb2, i9, a(str3), GeneratedMessageLite.m(method3, i, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m2 = GeneratedMessageLite.m(method4, i, new Object[0]);
                    if (method5 == null) {
                        if (m2 instanceof Boolean) {
                            z10 = !((Boolean) m2).booleanValue();
                        } else if (m2 instanceof Integer) {
                            if (((Integer) m2).intValue() != 0) {
                                b(sb2, i9, a(str4), m2);
                            }
                        } else if (m2 instanceof Float) {
                            if (((Float) m2).floatValue() != 0.0f) {
                                b(sb2, i9, a(str4), m2);
                            }
                        } else if (m2 instanceof Double) {
                            if (((Double) m2).doubleValue() != 0.0d) {
                                b(sb2, i9, a(str4), m2);
                            }
                        } else if (m2 instanceof String) {
                            z10 = m2.equals("");
                        } else if (m2 instanceof ByteString) {
                            z10 = m2.equals(ByteString.f10084b);
                        } else if (!(m2 instanceof I)) {
                            if ((m2 instanceof Enum) && ((Enum) m2).ordinal() == 0) {
                            }
                            b(sb2, i9, a(str4), m2);
                        } else if (m2 != ((I) m2).b()) {
                            b(sb2, i9, a(str4), m2);
                        }
                        if (!z10) {
                            b(sb2, i9, a(str4), m2);
                        }
                    } else if (((Boolean) GeneratedMessageLite.m(method5, i, new Object[0])).booleanValue()) {
                        b(sb2, i9, a(str4), m2);
                    }
                }
            }
        }
        if (i instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<GeneratedMessageLite.d, Object>> j10 = ((GeneratedMessageLite.c) i).extensions.j();
            while (j10.hasNext()) {
                Map.Entry<GeneratedMessageLite.d, Object> next = j10.next();
                next.getKey().getClass();
                b(sb2, i9, "[0]", next.getValue());
            }
        }
        e0 e0Var = ((GeneratedMessageLite) i).unknownFields;
        if (e0Var != null) {
            for (int i10 = 0; i10 < e0Var.f10211a; i10++) {
                b(sb2, i9, String.valueOf(e0Var.f10212b[i10] >>> 3), e0Var.f10213c[i10]);
            }
        }
    }
}
