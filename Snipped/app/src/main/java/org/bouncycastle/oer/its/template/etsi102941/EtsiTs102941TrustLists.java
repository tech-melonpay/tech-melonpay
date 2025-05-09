package org.bouncycastle.oer.its.template.etsi102941;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: classes3.dex */
public class EtsiTs102941TrustLists {
    public static final OERDefinition.Builder AaEntry;
    public static final OERDefinition.Builder CrlEntry;
    public static final OERDefinition.Builder CtlCommand;
    public static final OERDefinition.Builder CtlDelete;
    public static final OERDefinition.Builder CtlEntry;
    public static final OERDefinition.Builder CtlFormat;
    public static final OERDefinition.Builder DcDelete;
    public static final OERDefinition.Builder DcEntry;
    public static final OERDefinition.Builder DeltaCtl;
    public static final OERDefinition.Builder EaEntry;
    public static final OERDefinition.Builder FullCtl;
    public static final OERDefinition.Builder RootCaEntry;
    public static final OERDefinition.Builder SequenceOfCrlEntry;
    public static final OERDefinition.Builder SequenceOfCtlCommand;
    public static final OERDefinition.Builder TlmEntry;
    public static final OERDefinition.Builder ToBeSignedCrl;
    public static final OERDefinition.Builder ToBeSignedRcaCtl;
    public static final OERDefinition.Builder ToBeSignedTlmCtl;
    public static final OERDefinition.Builder Url;

    static {
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId8;
        OERDefinition.Builder typeName = builder.typeName("CrlEntry");
        CrlEntry = typeName;
        OERDefinition.Builder typeName2 = OERDefinition.seqof(typeName).typeName("SequenceOfCrlEntry");
        SequenceOfCrlEntry = typeName2;
        OERDefinition.Builder builder2 = EtsiTs102941BaseTypes.Version;
        OERDefinition.Builder label = builder2.label("version");
        OERDefinition.Builder builder3 = Ieee1609Dot2BaseTypes.Time32;
        ToBeSignedCrl = OERDefinition.seq(label, builder3.label("thisUpdate"), builder3.label("nextUpdate"), typeName2.label("entries"), OERDefinition.extension(new Object[0])).typeName("ToBeSignedCrl");
        OERDefinition.Builder typeName3 = OERDefinition.ia5String().typeName("Url");
        Url = typeName3;
        OERDefinition.Builder typeName4 = typeName3.typeName("DcDelete");
        DcDelete = typeName4;
        OERDefinition.Builder typeName5 = OERDefinition.seq(typeName3.label(ImagesContract.URL), Ieee1609Dot2BaseTypes.SequenceOfHashedId8.label("cert")).typeName("DcEntry");
        DcEntry = typeName5;
        OERDefinition.Builder builder4 = EtsiTs103097Module.EtsiTs103097Certificate;
        OERDefinition.Builder typeName6 = OERDefinition.seq(builder4.label("aaCertificate"), typeName3.label("accessPoint")).typeName("AaEntry");
        AaEntry = typeName6;
        OERDefinition.Builder typeName7 = OERDefinition.seq(builder4.label("eaCertificate"), typeName3.label("aaAccessPoint"), OERDefinition.optional(typeName3.label("itsAccessPoint"))).typeName("EaEntry");
        EaEntry = typeName7;
        OERDefinition.Builder typeName8 = OERDefinition.seq(builder4.label("selfsignedRootCa"), OERDefinition.optional(builder4.label("successorTo"))).typeName("RootCaEntry");
        RootCaEntry = typeName8;
        OERDefinition.Builder typeName9 = OERDefinition.seq(builder4.label("selfSignedTLMCertificate"), OERDefinition.optional(builder4.label("successorTo")), typeName3.label("accessPoint")).typeName("TlmEntry");
        TlmEntry = typeName9;
        OERDefinition.Builder typeName10 = OERDefinition.choice(builder.label("cert"), typeName4.label("dc"), OERDefinition.extension(new Object[0])).typeName("CtlDelete");
        CtlDelete = typeName10;
        OERDefinition.Builder typeName11 = OERDefinition.choice(typeName8.label("rca"), typeName7.label("ea"), typeName6.label("aa"), typeName5.label("dc"), typeName9.label("tlm"), OERDefinition.extension(new Object[0])).typeName("CtlEntry");
        CtlEntry = typeName11;
        OERDefinition.Builder typeName12 = OERDefinition.choice(typeName11.label(ProductAction.ACTION_ADD), typeName10.label("delete"), OERDefinition.extension(new Object[0])).typeName("CtlCommand");
        CtlCommand = typeName12;
        OERDefinition.Builder typeName13 = OERDefinition.seqof(typeName12).typeName("SequenceOfCtlCommand");
        SequenceOfCtlCommand = typeName13;
        OERDefinition.Builder typeName14 = OERDefinition.seq(builder2.label("version"), builder3.label("nextUpdate"), OERDefinition.bool().label("isFullCtl"), OERDefinition.integer(0L, 255L).label("ctlSequence"), typeName13.label("ctlCommands"), OERDefinition.extension(new Object[0])).typeName("CtlFormat");
        CtlFormat = typeName14;
        DeltaCtl = typeName14.typeName("DeltaCtl");
        FullCtl = typeName14.typeName("FullCtl");
        ToBeSignedTlmCtl = typeName14.typeName("ToBeSignedRcaCtl");
        ToBeSignedRcaCtl = typeName14.typeName("ToBeSignedRcaCtl");
    }
}
