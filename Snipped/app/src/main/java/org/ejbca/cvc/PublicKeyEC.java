package org.ejbca.cvc;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import org.bouncycastle.jce.ECPointUtil;

/* loaded from: classes3.dex */
public class PublicKeyEC extends CVCPublicKey implements ECPublicKey {
    public static final byte UNCOMPRESSED_POINT_TAG = 4;
    private static CVCTagEnum[] allowedFields = {CVCTagEnum.OID, CVCTagEnum.MODULUS, CVCTagEnum.COEFFICIENT_A, CVCTagEnum.COEFFICIENT_B, CVCTagEnum.BASE_POINT_G, CVCTagEnum.BASE_POINT_R_ORDER, CVCTagEnum.PUBLIC_POINT_Y, CVCTagEnum.COFACTOR_F};
    static final long serialVersionUID = 1;

    public PublicKeyEC(GenericPublicKeyField genericPublicKeyField) {
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.OID));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.MODULUS));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.COEFFICIENT_A));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.COEFFICIENT_B));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.BASE_POINT_G));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.BASE_POINT_R_ORDER));
        addSubfield(genericPublicKeyField.getSubfield(CVCTagEnum.PUBLIC_POINT_Y));
        addSubfield(genericPublicKeyField.getOptionalSubfield(CVCTagEnum.COFACTOR_F));
    }

    public static ECPoint decodePoint(byte[] bArr) {
        if (bArr[0] != 4) {
            throw new IllegalArgumentException("First byte must be 0x4");
        }
        int length = (bArr.length - 1) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - 1) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        System.arraycopy(bArr, length + 1, bArr3, 0, length2);
        return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    public static byte[] encodePoint(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        byte[] trimByteArray = CVCObject.trimByteArray(eCPoint.getAffineX().toByteArray());
        byte[] trimByteArray2 = CVCObject.trimByteArray(eCPoint.getAffineY().toByteArray());
        int fieldSize = ellipticCurve != null ? (ellipticCurve.getField().getFieldSize() + 7) >> 3 : trimByteArray.length > trimByteArray2.length ? trimByteArray.length : trimByteArray2.length;
        int length = trimByteArray.length < fieldSize ? fieldSize - trimByteArray.length : 0;
        int length2 = trimByteArray2.length < fieldSize ? fieldSize - trimByteArray2.length : 0;
        byte[] bArr = new byte[(fieldSize << 1) + 1];
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = 4;
        System.arraycopy(trimByteArray, 0, bArr, length + 1, fieldSize - length);
        System.arraycopy(trimByteArray2, 0, bArr, fieldSize + 1 + length2, fieldSize - length2);
        return bArr;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ECDSA";
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public CVCTagEnum[] getAllowedFields() {
        return allowedFields;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r3.getAuthRole().isCVCA() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r3 == null) goto L19;
     */
    @Override // org.ejbca.cvc.AbstractSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<org.ejbca.cvc.CVCObject> getEncodableFields() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.NoSuchFieldException -> L42
            r0.<init>()     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.OID     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            java.security.spec.ECParameterSpec r1 = r7.getParams()     // Catch: java.lang.NoSuchFieldException -> L42
            r2 = 0
            if (r1 == 0) goto L47
            org.ejbca.cvc.AbstractSequence r3 = r7.getParent()     // Catch: java.lang.NoSuchFieldException -> L42
            r4 = 1
            if (r3 == 0) goto L44
            org.ejbca.cvc.CVCTagEnum r5 = r3.getTag()     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCTagEnum r6 = org.ejbca.cvc.CVCTagEnum.CERTIFICATE_BODY     // Catch: java.lang.NoSuchFieldException -> L42
            if (r5 != r6) goto L44
            org.ejbca.cvc.CVCertificateBody r3 = (org.ejbca.cvc.CVCertificateBody) r3     // Catch: java.lang.NoSuchFieldException -> L47
            org.ejbca.cvc.CVCTagEnum r5 = org.ejbca.cvc.CVCTagEnum.HOLDER_AUTH_TEMPLATE     // Catch: java.lang.NoSuchFieldException -> L47
            org.ejbca.cvc.CVCObject r3 = r3.getOptionalSubfield(r5)     // Catch: java.lang.NoSuchFieldException -> L47
            if (r3 != 0) goto L2f
            goto L46
        L2f:
            org.ejbca.cvc.CVCAuthorizationTemplate r3 = (org.ejbca.cvc.CVCAuthorizationTemplate) r3     // Catch: java.lang.NoSuchFieldException -> L47
            org.ejbca.cvc.AuthorizationField r3 = r3.getAuthorizationField()     // Catch: java.lang.NoSuchFieldException -> L47
            if (r3 == 0) goto L47
            org.ejbca.cvc.AuthorizationRole r3 = r3.getAuthRole()     // Catch: java.lang.NoSuchFieldException -> L47
            boolean r3 = r3.isCVCA()     // Catch: java.lang.NoSuchFieldException -> L47
            if (r3 == 0) goto L47
            goto L46
        L42:
            r0 = move-exception
            goto L97
        L44:
            if (r3 != 0) goto L47
        L46:
            r2 = r4
        L47:
            if (r2 == 0) goto L82
            java.security.spec.EllipticCurve r1 = r1.getCurve()     // Catch: java.lang.NoSuchFieldException -> L42
            java.security.spec.ECField r1 = r1.getField()     // Catch: java.lang.NoSuchFieldException -> L42
            boolean r1 = r1 instanceof java.security.spec.ECFieldFp     // Catch: java.lang.NoSuchFieldException -> L42
            if (r1 == 0) goto L5e
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.MODULUS     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
        L5e:
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.COEFFICIENT_A     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.COEFFICIENT_B     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.BASE_POINT_G     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.BASE_POINT_R_ORDER     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
        L82:
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.PUBLIC_POINT_Y     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            if (r2 == 0) goto L96
            org.ejbca.cvc.CVCTagEnum r1 = org.ejbca.cvc.CVCTagEnum.COFACTOR_F     // Catch: java.lang.NoSuchFieldException -> L42
            org.ejbca.cvc.CVCObject r1 = r7.getSubfield(r1)     // Catch: java.lang.NoSuchFieldException -> L42
            r0.add(r1)     // Catch: java.lang.NoSuchFieldException -> L42
        L96:
            return r0
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ejbca.cvc.PublicKeyEC.getEncodableFields():java.util.List");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "CVC";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        ByteField byteField = (ByteField) getOptionalSubfield(CVCTagEnum.MODULUS);
        ByteField byteField2 = (ByteField) getOptionalSubfield(CVCTagEnum.COEFFICIENT_A);
        ByteField byteField3 = (ByteField) getOptionalSubfield(CVCTagEnum.COEFFICIENT_B);
        ByteField byteField4 = (ByteField) getOptionalSubfield(CVCTagEnum.BASE_POINT_G);
        ByteField byteField5 = (ByteField) getOptionalSubfield(CVCTagEnum.BASE_POINT_R_ORDER);
        IntegerField integerField = (IntegerField) getOptionalSubfield(CVCTagEnum.COFACTOR_F);
        if (byteField == null) {
            return null;
        }
        EllipticCurve ellipticCurve = new EllipticCurve(new ECFieldFp(new BigInteger(1, byteField.getData())), new BigInteger(1, byteField2.getData()), new BigInteger(1, byteField3.getData()));
        return new ECParameterSpec(ellipticCurve, ECPointUtil.decodePoint(ellipticCurve, byteField4.getData()), new BigInteger(1, byteField5.getData()), integerField.getValue());
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        try {
            return decodePoint(((ByteField) getSubfield(CVCTagEnum.PUBLIC_POINT_Y)).getData());
        } catch (NoSuchFieldException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public PublicKeyEC(OIDField oIDField, ECPublicKey eCPublicKey, AuthorizationRole authorizationRole) {
        addSubfield(oIDField);
        ECParameterSpec params = eCPublicKey.getParams();
        boolean z10 = authorizationRole == null || authorizationRole.isCVCA();
        if (z10) {
            ECField field = params.getCurve().getField();
            if (field instanceof ECFieldFp) {
                addSubfield(new ByteField(CVCTagEnum.MODULUS, CVCObject.trimByteArray(((ECFieldFp) field).getP().toByteArray())));
            }
            addSubfield(new ByteField(CVCTagEnum.COEFFICIENT_A, CVCObject.trimByteArray(params.getCurve().getA().toByteArray())));
            addSubfield(new ByteField(CVCTagEnum.COEFFICIENT_B, CVCObject.trimByteArray(params.getCurve().getB().toByteArray())));
            addSubfield(new ByteField(CVCTagEnum.BASE_POINT_G, encodePoint(params.getGenerator(), params.getCurve())));
            addSubfield(new ByteField(CVCTagEnum.BASE_POINT_R_ORDER, CVCObject.trimByteArray(params.getOrder().toByteArray())));
        }
        addSubfield(new ByteField(CVCTagEnum.PUBLIC_POINT_Y, encodePoint(eCPublicKey.getW(), params.getCurve())));
        if (z10) {
            addSubfield(new IntegerField(CVCTagEnum.COFACTOR_F, params.getCofactor()));
        }
    }

    public PublicKeyEC(OIDField oIDField, ECPublicKey eCPublicKey, AuthorizationRoleEnum authorizationRoleEnum) {
        this(oIDField, eCPublicKey, (AuthorizationRole) authorizationRoleEnum);
    }
}
