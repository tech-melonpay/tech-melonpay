package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzle {
    public static String zza(zzlc zzlcVar, String str) {
        StringBuilder r8 = a.r("# ", str);
        zzd(zzlcVar, r8, 0);
        return r8.toString();
    }

    public static final void zzb(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i, str, (Map.Entry) it2.next());
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
            sb2.append(zzlz.zza(zzix.zzm((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzix) {
            sb2.append(": \"");
            sb2.append(zzlz.zza((zzix) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzjx) {
            sb2.append(" {");
            zzd((zzjx) obj, sb2, i + 2);
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
        zzb(sb2, i11, "key", entry.getKey());
        zzb(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        while (i9 < i) {
            sb2.append(' ');
            i9++;
        }
        sb2.append("}");
    }

    private static final String zzc(String str) {
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

    private static void zzd(zzlc zzlcVar, StringBuilder sb2, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzlcVar.getClass().getDeclaredMethods()) {
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
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i, zzc(concat), zzjx.zzbE(method2, zzlcVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i, zzc(concat2), zzjx.zzbE(method3, zzlcVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzbE = zzjx.zzbE(method4, zzlcVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbE instanceof Boolean) {
                            if (((Boolean) zzbE).booleanValue()) {
                                zzb(sb2, i, zzc(concat3), zzbE);
                            }
                        } else if (zzbE instanceof Integer) {
                            if (((Integer) zzbE).intValue() != 0) {
                                zzb(sb2, i, zzc(concat3), zzbE);
                            }
                        } else if (zzbE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbE).floatValue()) != 0) {
                                zzb(sb2, i, zzc(concat3), zzbE);
                            }
                        } else if (!(zzbE instanceof Double)) {
                            if (zzbE instanceof String) {
                                equals = zzbE.equals("");
                            } else if (zzbE instanceof zzix) {
                                equals = zzbE.equals(zzix.zzb);
                            } else if (!(zzbE instanceof zzlc)) {
                                if ((zzbE instanceof Enum) && ((Enum) zzbE).ordinal() == 0) {
                                }
                                zzb(sb2, i, zzc(concat3), zzbE);
                            } else if (zzbE != ((zzlc) zzbE).zzbL()) {
                                zzb(sb2, i, zzc(concat3), zzbE);
                            }
                            if (!equals) {
                                zzb(sb2, i, zzc(concat3), zzbE);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzbE).doubleValue()) != 0) {
                            zzb(sb2, i, zzc(concat3), zzbE);
                        }
                    } else if (((Boolean) zzjx.zzbE(method5, zzlcVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i, zzc(concat3), zzbE);
                    }
                }
            }
        }
        if (zzlcVar instanceof zzju) {
            throw null;
        }
        zzmc zzmcVar = ((zzjx) zzlcVar).zzc;
        if (zzmcVar != null) {
            zzmcVar.zzg(sb2, i);
        }
    }
}
