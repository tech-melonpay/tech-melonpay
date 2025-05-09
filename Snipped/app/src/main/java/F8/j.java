package F8;

import B5.h;
import P9.s;
import com.luminary.business.presentation.utils.extensions.FeeType;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PriceListDomainExt.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final String a(B5.h hVar, FeeType feeType, String str) {
        Float f10;
        Integer num;
        Float f11;
        Integer num2;
        Float f12;
        Integer num3;
        Float f13;
        Integer num4;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str2 = "€";
        String str3 = kotlin.jvm.internal.f.b(lowerCase, "gbp") ? "£" : kotlin.jvm.internal.f.b(lowerCase, "eur") ? "€" : "";
        int ordinal = feeType.ordinal();
        List<h.a> list = hVar.f333b;
        float f14 = 0.0f;
        Object obj = null;
        if (ordinal == 0) {
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    h.a aVar = (h.a) next;
                    Integer num5 = aVar.f355n;
                    if (num5 != null && num5.intValue() == 7 && (num = aVar.f345c) != null && num.intValue() == 0) {
                        String str4 = aVar.i;
                        if (kotlin.jvm.internal.f.b(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "gbp")) {
                            obj = next;
                            break;
                        }
                    }
                }
                h.a aVar2 = (h.a) obj;
                if (aVar2 != null && (f10 = aVar2.f348f) != null) {
                    f14 = f10.floatValue();
                }
            }
            str2 = "£";
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        h.a aVar3 = (h.a) next2;
                        Integer num6 = aVar3.f355n;
                        if (num6 != null && num6.intValue() == 4 && (num4 = aVar3.f345c) != null && num4.intValue() == 0) {
                            String str5 = aVar3.i;
                            if (kotlin.jvm.internal.f.b(str5 != null ? str5.toLowerCase(Locale.ROOT) : null, str.toLowerCase(Locale.ROOT))) {
                                obj = next2;
                                break;
                            }
                        }
                    }
                    h.a aVar4 = (h.a) obj;
                    if (aVar4 != null && (f13 = aVar4.f348f) != null) {
                        f14 = f13.floatValue();
                    }
                }
            } else if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    h.a aVar5 = (h.a) next3;
                    Integer num7 = aVar5.f355n;
                    if (num7 != null && num7.intValue() == 1 && (num3 = aVar5.f345c) != null && num3.intValue() == 0) {
                        String str6 = aVar5.i;
                        if (kotlin.jvm.internal.f.b(str6 != null ? str6.toLowerCase(Locale.ROOT) : null, str.toLowerCase(Locale.ROOT))) {
                            obj = next3;
                            break;
                        }
                    }
                }
                h.a aVar6 = (h.a) obj;
                if (aVar6 != null && (f12 = aVar6.f348f) != null) {
                    f14 = f12.floatValue();
                }
            }
            str2 = str3;
        } else if (list != null) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next4 = it4.next();
                h.a aVar7 = (h.a) next4;
                Integer num8 = aVar7.f355n;
                if (num8 != null && num8.intValue() == 3 && (num2 = aVar7.f345c) != null && num2.intValue() == 0) {
                    String str7 = aVar7.i;
                    if (kotlin.jvm.internal.f.b(str7 != null ? str7.toLowerCase(Locale.ROOT) : null, "eur")) {
                        obj = next4;
                        break;
                    }
                }
            }
            h.a aVar8 = (h.a) obj;
            if (aVar8 != null && (f11 = aVar8.f348f) != null) {
                f14 = f11.floatValue();
            }
        }
        List r02 = C0969n.r0(String.valueOf(f14), new String[]{"."});
        if (r02.size() == 1) {
            return str2 + s.J(r02) + ".00";
        }
        if (((String) s.Q(r02)).length() != 1) {
            return str2 + s.J(r02) + "." + ((String) s.Q(r02)).substring(0, 2);
        }
        return str2 + s.J(r02) + "." + s.Q(r02) + "0";
    }

    public static final float b(B5.h hVar, FeeType feeType, String str) {
        Float f10;
        Integer num;
        Float f11;
        Integer num2;
        Float f12;
        Integer num3;
        Float f13;
        Integer num4;
        int ordinal = feeType.ordinal();
        List<h.a> list = hVar.f333b;
        Object obj = null;
        if (ordinal == 0) {
            if (list == null) {
                return 0.0f;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                h.a aVar = (h.a) next;
                Integer num5 = aVar.f355n;
                if (num5 != null && num5.intValue() == 6 && (num = aVar.f345c) != null && num.intValue() == 0 && kotlin.jvm.internal.f.b(aVar.i, "gbp")) {
                    obj = next;
                    break;
                }
            }
            h.a aVar2 = (h.a) obj;
            if (aVar2 == null || (f10 = aVar2.f348f) == null) {
                return 0.0f;
            }
            return f10.floatValue();
        }
        if (ordinal == 1) {
            if (list == null) {
                return 0.0f;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                h.a aVar3 = (h.a) next2;
                Integer num6 = aVar3.f355n;
                if (num6 != null && num6.intValue() == 3 && (num2 = aVar3.f345c) != null && num2.intValue() == 0 && kotlin.jvm.internal.f.b(aVar3.i, "eur")) {
                    obj = next2;
                    break;
                }
            }
            h.a aVar4 = (h.a) obj;
            if (aVar4 == null || (f11 = aVar4.f348f) == null) {
                return 0.0f;
            }
            return f11.floatValue();
        }
        if (ordinal == 2) {
            if (list == null) {
                return 0.0f;
            }
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                h.a aVar5 = (h.a) next3;
                Integer num7 = aVar5.f355n;
                if (num7 != null && num7.intValue() == 4 && (num3 = aVar5.f345c) != null && num3.intValue() == 0) {
                    String str2 = aVar5.i;
                    if (kotlin.jvm.internal.f.b(str2 != null ? str2.toLowerCase(Locale.ROOT) : null, str.toLowerCase(Locale.ROOT))) {
                        obj = next3;
                        break;
                    }
                }
            }
            h.a aVar6 = (h.a) obj;
            if (aVar6 == null || (f12 = aVar6.f348f) == null) {
                return 0.0f;
            }
            return f12.floatValue();
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (list == null) {
            return 0.0f;
        }
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            h.a aVar7 = (h.a) next4;
            Integer num8 = aVar7.f355n;
            if (num8 != null && num8.intValue() == 1 && (num4 = aVar7.f345c) != null && num4.intValue() == 0) {
                String str3 = aVar7.i;
                if (kotlin.jvm.internal.f.b(str3 != null ? str3.toLowerCase(Locale.ROOT) : null, str.toLowerCase(Locale.ROOT))) {
                    obj = next4;
                    break;
                }
            }
        }
        h.a aVar8 = (h.a) obj;
        if (aVar8 == null || (f13 = aVar8.f348f) == null) {
            return 0.0f;
        }
        return f13.floatValue();
    }
}
