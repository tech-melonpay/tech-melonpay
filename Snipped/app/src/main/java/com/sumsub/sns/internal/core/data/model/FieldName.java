package com.sumsub.sns.internal.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.a;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

@InterfaceC1080d(with = Companion.C0200a.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b)\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/FieldName;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "firstName", "lastName", "middleName", "email", "phone", "countryOfBirth", "stateOfBirth", "dob", "placeOfBirth", "legalName", "gender", "nationality", "country", "taxResidenceCountry", "street", "subStreet", "buildingNumber", "flatNumber", "town", "state", "postCode", "transactionAmount", "incomeSourceType", "investmentKnowledgeLevel", "annualIncome", "netWorth", "tin", "number", "issuedDate", "other", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum FieldName {
    firstName("firstName"),
    lastName("lastName"),
    middleName("middleName"),
    email("email"),
    phone("phone"),
    countryOfBirth("countryOfBirth"),
    stateOfBirth("stateOfBirth"),
    dob("dob"),
    placeOfBirth("placeOfBirth"),
    legalName("legalName"),
    gender("gender"),
    nationality("nationality"),
    country("country"),
    taxResidenceCountry("taxResidenceCountry"),
    street("street"),
    subStreet("subStreet"),
    buildingNumber("buildingNumber"),
    flatNumber("flatNumber"),
    town("town"),
    state("state"),
    postCode("postCode"),
    transactionAmount("transactionAmount"),
    incomeSourceType("incomeSourceType"),
    investmentKnowledgeLevel("investmentKnowledgeLevel"),
    annualIncome("annualIncome"),
    netWorth("netWorth"),
    tin("tin"),
    number("number"),
    issuedDate("issuedDate"),
    other("");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String value;

    /* renamed from: com.sumsub.sns.internal.core.data.model.FieldName$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: com.sumsub.sns.internal.core.data.model.FieldName$a$a, reason: collision with other inner class name */
        public static final class C0200a implements InterfaceC1078b<FieldName> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0200a f15259a = new C0200a();

            /* renamed from: b, reason: collision with root package name */
            public static final pa.f f15260b = a.a("FieldName", e.i.f25738a);

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, FieldName fieldName) {
                interfaceC1145e.F(fieldName.getValue());
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15260b;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FieldName deserialize(InterfaceC1144d interfaceC1144d) {
                FieldName fieldName;
                String p10 = interfaceC1144d.p();
                FieldName[] values = FieldName.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fieldName = null;
                        break;
                    }
                    fieldName = values[i];
                    if (kotlin.jvm.internal.f.b(fieldName.getValue(), p10)) {
                        break;
                    }
                    i++;
                }
                if (fieldName != null) {
                    return fieldName;
                }
                FieldName fieldName2 = FieldName.other;
                fieldName2.setValue(p10);
                return fieldName2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FieldName a(String str) {
            FieldName fieldName;
            FieldName[] values = FieldName.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    fieldName = null;
                    break;
                }
                fieldName = values[i];
                if (kotlin.jvm.internal.f.b(fieldName.getValue(), str)) {
                    break;
                }
                i++;
            }
            if (fieldName == null) {
                fieldName = FieldName.other;
                if (str == null) {
                    str = "";
                }
                fieldName.setValue(str);
            }
            return fieldName;
        }

        public final InterfaceC1078b<FieldName> serializer() {
            return C0200a.f15259a;
        }

        public Companion() {
        }
    }

    FieldName(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
