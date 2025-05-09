package com.sumsub.sns.internal.presentation.utils;

import P9.s;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18990a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.firstName.ordinal()] = 1;
            iArr[FieldName.lastName.ordinal()] = 2;
            iArr[FieldName.middleName.ordinal()] = 3;
            iArr[FieldName.tin.ordinal()] = 4;
            iArr[FieldName.phone.ordinal()] = 5;
            iArr[FieldName.countryOfBirth.ordinal()] = 6;
            iArr[FieldName.stateOfBirth.ordinal()] = 7;
            iArr[FieldName.placeOfBirth.ordinal()] = 8;
            iArr[FieldName.legalName.ordinal()] = 9;
            iArr[FieldName.gender.ordinal()] = 10;
            iArr[FieldName.nationality.ordinal()] = 11;
            iArr[FieldName.dob.ordinal()] = 12;
            iArr[FieldName.email.ordinal()] = 13;
            iArr[FieldName.buildingNumber.ordinal()] = 14;
            iArr[FieldName.flatNumber.ordinal()] = 15;
            iArr[FieldName.postCode.ordinal()] = 16;
            iArr[FieldName.state.ordinal()] = 17;
            iArr[FieldName.street.ordinal()] = 18;
            iArr[FieldName.subStreet.ordinal()] = 19;
            iArr[FieldName.town.ordinal()] = 20;
            f18990a = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String a(g gVar, FieldName fieldName) {
        List<Map<String, String>> n10;
        Map map;
        switch (fieldName == null ? -1 : a.f18990a[fieldName.ordinal()]) {
            case 1:
                g.a C10 = gVar.C();
                if (C10 != null) {
                    return C10.r();
                }
                return null;
            case 2:
                g.a C11 = gVar.C();
                if (C11 != null) {
                    return C11.t();
                }
                return null;
            case 3:
                g.a C12 = gVar.C();
                if (C12 != null) {
                    return C12.v();
                }
                return null;
            case 4:
                g.a C13 = gVar.C();
                if (C13 != null) {
                    return C13.z();
                }
                return null;
            case 5:
                return gVar.G();
            case 6:
                g.a C14 = gVar.C();
                if (C14 != null) {
                    return C14.p();
                }
                return null;
            case 7:
                g.a C15 = gVar.C();
                if (C15 != null) {
                    return C15.y();
                }
                return null;
            case 8:
                g.a C16 = gVar.C();
                if (C16 != null) {
                    return C16.x();
                }
                return null;
            case 9:
                g.a C17 = gVar.C();
                if (C17 != null) {
                    return C17.u();
                }
                return null;
            case 10:
                g.a C18 = gVar.C();
                if (C18 != null) {
                    return C18.s();
                }
                return null;
            case 11:
                g.a C19 = gVar.C();
                if (C19 != null) {
                    return C19.w();
                }
                return null;
            case 12:
                g.a C20 = gVar.C();
                if (C20 != null) {
                    return C20.q();
                }
                return null;
            case 13:
                return gVar.x();
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                g.a C21 = gVar.C();
                if (C21 != null && (n10 = C21.n()) != null && (map = (Map) s.L(n10)) != null) {
                    return (String) map.get(fieldName.getValue());
                }
                return null;
            default:
                return null;
        }
    }
}
