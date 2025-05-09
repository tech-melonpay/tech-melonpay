package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.core.impl.utils.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import s3.b;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzfq {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfo zzfoVar, String str) {
        StringBuilder r8 = a.r("# ", str);
        zzd(zzfoVar, r8, 0);
        return r8.toString();
    }

    public static void zzb(StringBuilder sb2, int i, String str, Object obj) {
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
        zzc(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgw.zza(new zzcy(((String) obj).getBytes(zzem.zzb))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzdb) {
            sb2.append(": \"");
            sb2.append(zzgw.zza((zzdb) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzed) {
            sb2.append(" {");
            zzd((zzed) obj, sb2, i + 2);
            sb2.append("\n");
            zzc(i, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i + 2;
        zzb(sb2, i10, "key", entry.getKey());
        zzb(sb2, i10, "value", entry.getValue());
        sb2.append("\n");
        zzc(i, sb2);
        sb2.append("}");
    }

    private static void zzc(int i, StringBuilder sb2) {
        while (i > 0) {
            int i9 = 80;
            if (i <= 80) {
                i9 = i;
            }
            sb2.append(zza, 0, i9);
            i -= i9;
        }
    }

    private static void zzd(zzfo zzfoVar, StringBuilder sb2, int i) {
        int i9;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfoVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i9);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i, substring.substring(0, substring.length() - 4), zzed.zzQ(method2, zzfoVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i, substring.substring(0, substring.length() - 3), zzed.zzQ(method, zzfoVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzQ = zzed.zzQ(method4, zzfoVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzed.zzQ(method5, zzfoVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    } else if (zzQ instanceof Boolean) {
                        if (!((Boolean) zzQ).booleanValue()) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    } else if (zzQ instanceof Integer) {
                        if (((Integer) zzQ).intValue() == 0) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    } else if (zzQ instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzQ).floatValue()) == 0) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    } else if (zzQ instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzQ).doubleValue()) == 0) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    } else {
                        if (zzQ instanceof String) {
                            equals = zzQ.equals("");
                        } else if (zzQ instanceof zzdb) {
                            equals = zzQ.equals(zzdb.zzb);
                        } else if (zzQ instanceof zzfo) {
                            if (zzQ == ((zzfo) zzQ).zzab()) {
                            }
                            zzb(sb2, i, substring, zzQ);
                        } else {
                            if ((zzQ instanceof Enum) && ((Enum) zzQ).ordinal() == 0) {
                            }
                            zzb(sb2, i, substring, zzQ);
                        }
                        if (equals) {
                        }
                        zzb(sb2, i, substring, zzQ);
                    }
                }
            }
            i9 = 3;
        }
        if (zzfoVar instanceof zzdz) {
            Iterator zzf = ((zzdz) zzfoVar).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb2, i, b.i("[", ((zzea) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzgz zzgzVar = ((zzed) zzfoVar).zzc;
        if (zzgzVar != null) {
            zzgzVar.zzi(sb2, i);
        }
    }
}
