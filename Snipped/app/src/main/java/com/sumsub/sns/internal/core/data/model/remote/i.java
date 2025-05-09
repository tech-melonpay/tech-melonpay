package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.core.data.model.FlowType$$serializer;
import com.sumsub.sns.internal.core.data.model.remote.a;
import com.sumsub.sns.internal.core.data.model.remote.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.K;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u0002 -B\u0099\u0002\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aB¯\u0002\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010#J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u001e\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010#J¤\u0002\u0010 \u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b \u00106J\u0010\u00107\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b7\u0010#J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J(\u0010 \u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AHÇ\u0001¢\u0006\u0004\b \u0010DR.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010I\u0012\u0004\bK\u0010H\u001a\u0004\bJ\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010I\u0012\u0004\bM\u0010H\u001a\u0004\bL\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010N\u0012\u0004\bP\u0010H\u001a\u0004\bO\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010I\u0012\u0004\bR\u0010H\u001a\u0004\bQ\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010I\u0012\u0004\bT\u0010H\u001a\u0004\bS\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010U\u0012\u0004\bW\u0010H\u001a\u0004\bV\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010I\u0012\u0004\bY\u0010H\u001a\u0004\bX\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010I\u0012\u0004\b[\u0010H\u001a\u0004\bZ\u0010#R.\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010E\u0012\u0004\b]\u0010H\u001a\u0004\b\\\u0010!R.\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010E\u0012\u0004\b_\u0010H\u001a\u0004\b^\u0010!R.\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010E\u0012\u0004\ba\u0010H\u001a\u0004\b`\u0010!R.\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010E\u0012\u0004\bc\u0010H\u001a\u0004\bb\u0010!R.\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010E\u0012\u0004\be\u0010H\u001a\u0004\bd\u0010!R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010f\u0012\u0004\bh\u0010H\u001a\u0004\bg\u00103R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010I\u0012\u0004\bj\u0010H\u001a\u0004\bi\u0010#R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010I\u0012\u0004\bl\u0010H\u001a\u0004\bk\u0010#¨\u0006n"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/i;", "", "", "", "uiConf", "applicantId", "flowName", "Lcom/sumsub/sns/core/data/model/FlowType;", "flowType", "idDocSetType", "actionId", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "actionType", "faceLivenessLic", "facemapPublicKey", "sdkDict", "documentsByCountries", "Lcom/sumsub/sns/internal/core/data/model/remote/c;", "phoneCountryCodeWithMasks", "tinCountryInfo", "initMetadata", "Lcom/sumsub/sns/internal/core/data/model/remote/a;", "eKycConfig", "verificationUrl", "accessToken", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "a", "()Ljava/util/Map;", "j", "()Ljava/lang/String;", "k", "l", "()Lcom/sumsub/sns/core/data/model/FlowType;", "m", "n", "o", "()Lcom/sumsub/sns/core/data/model/FlowActionType;", "p", "q", "b", "c", "d", "e", "f", "g", "()Lcom/sumsub/sns/internal/core/data/model/remote/a;", "h", "i", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowType;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/internal/core/data/model/remote/a;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/i;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/i;Lqa/c;Lpa/f;)V", "Ljava/util/Map;", "V", "getUiConf$annotations", "()V", "Ljava/lang/String;", "x", "getApplicantId$annotations", "H", "getFlowName$annotations", "Lcom/sumsub/sns/core/data/model/FlowType;", "J", "getFlowType$annotations", "L", "getIdDocSetType$annotations", "t", "getActionId$annotations", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "v", "getActionType$annotations", "D", "getFaceLivenessLic$annotations", "F", "getFacemapPublicKey$annotations", "R", "getSdkDict$annotations", "z", "getDocumentsByCountries$annotations", "P", "getPhoneCountryCodeWithMasks$annotations", "T", "getTinCountryInfo$annotations", "N", "getInitMetadata$annotations", "Lcom/sumsub/sns/internal/core/data/model/remote/a;", "B", "getEKycConfig$annotations", "X", "getVerificationUrl$annotations", "r", "getAccessToken$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class i {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> uiConf;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String flowName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final FlowType flowType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String actionId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final FlowActionType actionType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String faceLivenessLic;

    /* renamed from: i, reason: from kotlin metadata */
    public final String facemapPublicKey;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Map<Object, Object> sdkDict;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> documentsByCountries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Map<String, c> phoneCountryCodeWithMasks;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> tinCountryInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> initMetadata;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final com.sumsub.sns.internal.core.data.model.remote.a eKycConfig;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final String verificationUrl;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final String accessToken;

    public static final class a implements InterfaceC1162A<i> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15638a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15639b;

        static {
            a aVar = new a();
            f15638a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteConfig", aVar, 17);
            pluginGeneratedSerialDescriptor.k("uiConf", true);
            pluginGeneratedSerialDescriptor.k("applicantId", true);
            pluginGeneratedSerialDescriptor.k("flowName", true);
            pluginGeneratedSerialDescriptor.k("flowType", true);
            pluginGeneratedSerialDescriptor.k("idDocSetType", true);
            pluginGeneratedSerialDescriptor.k("actionId", true);
            pluginGeneratedSerialDescriptor.k("actionType", true);
            pluginGeneratedSerialDescriptor.k("faceLivenessLic", true);
            pluginGeneratedSerialDescriptor.k("facemapPublicKey", true);
            pluginGeneratedSerialDescriptor.k("sdkDict", false);
            pluginGeneratedSerialDescriptor.k("documentsByCountries", true);
            pluginGeneratedSerialDescriptor.k("phoneCountryCodeWithMasks", true);
            pluginGeneratedSerialDescriptor.k("tinCountryInfo", true);
            pluginGeneratedSerialDescriptor.k("initMetadata", true);
            pluginGeneratedSerialDescriptor.k("eKycConfig", true);
            pluginGeneratedSerialDescriptor.k("verificationUrl", true);
            pluginGeneratedSerialDescriptor.k("accessToken", true);
            f15639b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i deserialize(InterfaceC1144d interfaceC1144d) {
            Object obj;
            int i;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            Object obj11;
            Object obj12;
            Object obj13;
            Object obj14;
            Object obj15;
            Object obj16;
            Object obj17;
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            int i9 = 0;
            boolean z10 = true;
            while (z10) {
                Object obj35 = obj23;
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        Object obj36 = obj32;
                        obj2 = obj19;
                        obj3 = obj36;
                        z10 = false;
                        obj23 = obj35;
                        obj28 = obj28;
                        obj21 = obj21;
                        Object obj37 = obj2;
                        obj32 = obj3;
                        obj19 = obj37;
                    case 0:
                        obj4 = obj21;
                        obj5 = obj22;
                        obj6 = obj24;
                        obj7 = obj35;
                        Object obj38 = obj32;
                        obj2 = obj19;
                        obj3 = obj38;
                        obj31 = c2.D(descriptor, 0, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj31);
                        i9 |= 1;
                        obj27 = obj27;
                        obj30 = obj30;
                        obj29 = obj29;
                        obj28 = obj28;
                        obj20 = obj20;
                        obj18 = obj18;
                        obj34 = obj34;
                        obj33 = obj33;
                        obj24 = obj6;
                        obj23 = obj7;
                        obj21 = obj4;
                        obj22 = obj5;
                        Object obj372 = obj2;
                        obj32 = obj3;
                        obj19 = obj372;
                    case 1:
                        obj4 = obj21;
                        obj5 = obj22;
                        obj6 = obj24;
                        obj7 = obj35;
                        Object obj39 = obj32;
                        obj2 = obj19;
                        obj3 = c2.D(descriptor, 1, m0.f26414a, obj39);
                        i9 |= 2;
                        obj20 = obj20;
                        obj18 = obj18;
                        obj24 = obj6;
                        obj23 = obj7;
                        obj21 = obj4;
                        obj22 = obj5;
                        Object obj3722 = obj2;
                        obj32 = obj3;
                        obj19 = obj3722;
                    case 2:
                        obj8 = obj22;
                        obj33 = c2.D(descriptor, 2, m0.f26414a, obj33);
                        i9 |= 4;
                        obj24 = obj24;
                        obj20 = obj20;
                        obj18 = obj18;
                        obj21 = obj21;
                        obj23 = obj35;
                        obj22 = obj8;
                    case 3:
                        obj9 = obj20;
                        obj10 = obj18;
                        obj11 = obj21;
                        obj8 = obj22;
                        obj34 = c2.D(descriptor, 3, FlowType$$serializer.INSTANCE, obj34);
                        i9 |= 8;
                        obj23 = obj35;
                        obj20 = obj9;
                        obj18 = obj10;
                        obj21 = obj11;
                        obj22 = obj8;
                    case 4:
                        obj9 = obj20;
                        obj10 = obj18;
                        obj11 = obj21;
                        obj8 = obj22;
                        obj23 = c2.D(descriptor, 4, m0.f26414a, obj35);
                        i9 |= 16;
                        obj20 = obj9;
                        obj18 = obj10;
                        obj21 = obj11;
                        obj22 = obj8;
                    case 5:
                        obj12 = obj20;
                        obj13 = obj18;
                        obj14 = obj21;
                        obj24 = c2.D(descriptor, 5, m0.f26414a, obj24);
                        i9 |= 32;
                        obj23 = obj35;
                        obj20 = obj12;
                        obj18 = obj13;
                        obj21 = obj14;
                    case 6:
                        obj15 = obj20;
                        obj16 = obj18;
                        obj25 = c2.D(descriptor, 6, com.sumsub.sns.internal.core.data.serializer.b.f15824a, obj25);
                        i9 |= 64;
                        obj23 = obj35;
                        obj20 = obj15;
                        obj18 = obj16;
                    case 7:
                        obj15 = obj20;
                        obj16 = obj18;
                        obj26 = c2.D(descriptor, 7, m0.f26414a, obj26);
                        i9 |= 128;
                        obj23 = obj35;
                        obj20 = obj15;
                        obj18 = obj16;
                    case 8:
                        obj15 = obj20;
                        obj16 = obj18;
                        obj27 = c2.D(descriptor, 8, m0.f26414a, obj27);
                        i9 |= 256;
                        obj23 = obj35;
                        obj20 = obj15;
                        obj18 = obj16;
                    case 9:
                        obj9 = obj20;
                        obj10 = obj18;
                        obj11 = obj21;
                        obj8 = obj22;
                        obj17 = obj24;
                        obj28 = c2.D(descriptor, 9, new K(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]), new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj28);
                        i9 |= 512;
                        obj23 = obj35;
                        obj24 = obj17;
                        obj20 = obj9;
                        obj18 = obj10;
                        obj21 = obj11;
                        obj22 = obj8;
                    case 10:
                        obj9 = obj20;
                        obj10 = obj18;
                        obj11 = obj21;
                        obj8 = obj22;
                        obj17 = obj24;
                        obj29 = c2.D(descriptor, 10, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj29);
                        i9 |= 1024;
                        obj23 = obj35;
                        obj24 = obj17;
                        obj20 = obj9;
                        obj18 = obj10;
                        obj21 = obj11;
                        obj22 = obj8;
                    case 11:
                        obj12 = obj20;
                        obj13 = obj18;
                        obj14 = obj21;
                        obj30 = c2.D(descriptor, 11, new K(m0.f26414a, c.a.f15581a), obj30);
                        i9 |= 2048;
                        obj23 = obj35;
                        obj20 = obj12;
                        obj18 = obj13;
                        obj21 = obj14;
                    case 12:
                        obj17 = obj24;
                        obj8 = obj22;
                        obj11 = obj21;
                        obj9 = obj20;
                        obj10 = obj18;
                        obj19 = c2.D(descriptor, 12, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), obj19);
                        i9 |= 4096;
                        obj23 = obj35;
                        obj24 = obj17;
                        obj20 = obj9;
                        obj18 = obj10;
                        obj21 = obj11;
                        obj22 = obj8;
                    case 13:
                        obj = obj24;
                        m0 m0Var = m0.f26414a;
                        obj20 = c2.D(descriptor, 13, new K(m0Var, m0Var), obj20);
                        i9 |= 8192;
                        obj23 = obj35;
                        obj24 = obj;
                    case 14:
                        obj = obj24;
                        obj18 = c2.D(descriptor, 14, a.C0212a.f15571a, obj18);
                        i9 |= 16384;
                        obj23 = obj35;
                        obj24 = obj;
                    case 15:
                        obj = obj24;
                        obj21 = c2.D(descriptor, 15, m0.f26414a, obj21);
                        i = 32768;
                        i9 |= i;
                        obj23 = obj35;
                        obj24 = obj;
                    case 16:
                        obj = obj24;
                        obj22 = c2.D(descriptor, 16, m0.f26414a, obj22);
                        i = 65536;
                        i9 |= i;
                        obj23 = obj35;
                        obj24 = obj;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            Object obj40 = obj18;
            Object obj41 = obj21;
            Object obj42 = obj22;
            Object obj43 = obj23;
            Object obj44 = obj24;
            Object obj45 = obj33;
            Object obj46 = obj34;
            Object obj47 = obj32;
            c2.b(descriptor);
            return new i(i9, (Map) obj31, (String) obj47, (String) obj45, (FlowType) obj46, (String) obj43, (String) obj44, (FlowActionType) obj25, (String) obj26, (String) obj27, (Map) obj28, (Map) obj29, (Map) obj30, (Map) obj19, (Map) obj20, (com.sumsub.sns.internal.core.data.model.remote.a) obj40, (String) obj41, (String) obj42, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(FlowType$$serializer.INSTANCE), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(com.sumsub.sns.internal.core.data.serializer.b.f15824a), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new K(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]), new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(new K(m0Var, c.a.f15581a)), C1095a.a(new K(m0Var, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]))), C1095a.a(new K(m0Var, m0Var)), C1095a.a(a.C0212a.f15571a), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15639b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, i iVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            i.a(iVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<i> serializer() {
            return a.f15638a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ i(int i, Map map, String str, String str2, FlowType flowType, String str3, String str4, FlowActionType flowActionType, String str5, String str6, Map map2, Map map3, Map map4, Map map5, Map map6, com.sumsub.sns.internal.core.data.model.remote.a aVar, String str7, String str8, i0 i0Var) {
        if (512 != (i & 512)) {
            a0.h(i, 512, a.f15638a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.uiConf = null;
        } else {
            this.uiConf = map;
        }
        if ((i & 2) == 0) {
            this.applicantId = null;
        } else {
            this.applicantId = str;
        }
        if ((i & 4) == 0) {
            this.flowName = null;
        } else {
            this.flowName = str2;
        }
        if ((i & 8) == 0) {
            this.flowType = null;
        } else {
            this.flowType = flowType;
        }
        if ((i & 16) == 0) {
            this.idDocSetType = null;
        } else {
            this.idDocSetType = str3;
        }
        if ((i & 32) == 0) {
            this.actionId = null;
        } else {
            this.actionId = str4;
        }
        if ((i & 64) == 0) {
            this.actionType = null;
        } else {
            this.actionType = flowActionType;
        }
        if ((i & 128) == 0) {
            this.faceLivenessLic = null;
        } else {
            this.faceLivenessLic = str5;
        }
        if ((i & 256) == 0) {
            this.facemapPublicKey = null;
        } else {
            this.facemapPublicKey = str6;
        }
        this.sdkDict = map2;
        if ((i & 1024) == 0) {
            this.documentsByCountries = null;
        } else {
            this.documentsByCountries = map3;
        }
        if ((i & 2048) == 0) {
            this.phoneCountryCodeWithMasks = null;
        } else {
            this.phoneCountryCodeWithMasks = map4;
        }
        if ((i & 4096) == 0) {
            this.tinCountryInfo = null;
        } else {
            this.tinCountryInfo = map5;
        }
        if ((i & 8192) == 0) {
            this.initMetadata = null;
        } else {
            this.initMetadata = map6;
        }
        if ((i & 16384) == 0) {
            this.eKycConfig = null;
        } else {
            this.eKycConfig = aVar;
        }
        if ((32768 & i) == 0) {
            this.verificationUrl = null;
        } else {
            this.verificationUrl = str7;
        }
        if ((i & 65536) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str8;
        }
    }

    /* renamed from: B, reason: from getter */
    public final com.sumsub.sns.internal.core.data.model.remote.a getEKycConfig() {
        return this.eKycConfig;
    }

    /* renamed from: D, reason: from getter */
    public final String getFaceLivenessLic() {
        return this.faceLivenessLic;
    }

    /* renamed from: F, reason: from getter */
    public final String getFacemapPublicKey() {
        return this.facemapPublicKey;
    }

    /* renamed from: H, reason: from getter */
    public final String getFlowName() {
        return this.flowName;
    }

    /* renamed from: J, reason: from getter */
    public final FlowType getFlowType() {
        return this.flowType;
    }

    /* renamed from: L, reason: from getter */
    public final String getIdDocSetType() {
        return this.idDocSetType;
    }

    public final Map<String, String> N() {
        return this.initMetadata;
    }

    public final Map<String, c> P() {
        return this.phoneCountryCodeWithMasks;
    }

    public final Map<Object, Object> R() {
        return this.sdkDict;
    }

    public final Map<String, Object> T() {
        return this.tinCountryInfo;
    }

    public final Map<String, Object> V() {
        return this.uiConf;
    }

    /* renamed from: X, reason: from getter */
    public final String getVerificationUrl() {
        return this.verificationUrl;
    }

    public final Map<String, Object> a() {
        return this.uiConf;
    }

    public final Map<Object, Object> b() {
        return this.sdkDict;
    }

    public final Map<String, Object> c() {
        return this.documentsByCountries;
    }

    public final Map<String, c> d() {
        return this.phoneCountryCodeWithMasks;
    }

    public final Map<String, Object> e() {
        return this.tinCountryInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return kotlin.jvm.internal.f.b(this.uiConf, iVar.uiConf) && kotlin.jvm.internal.f.b(this.applicantId, iVar.applicantId) && kotlin.jvm.internal.f.b(this.flowName, iVar.flowName) && this.flowType == iVar.flowType && kotlin.jvm.internal.f.b(this.idDocSetType, iVar.idDocSetType) && kotlin.jvm.internal.f.b(this.actionId, iVar.actionId) && kotlin.jvm.internal.f.b(this.actionType, iVar.actionType) && kotlin.jvm.internal.f.b(this.faceLivenessLic, iVar.faceLivenessLic) && kotlin.jvm.internal.f.b(this.facemapPublicKey, iVar.facemapPublicKey) && kotlin.jvm.internal.f.b(this.sdkDict, iVar.sdkDict) && kotlin.jvm.internal.f.b(this.documentsByCountries, iVar.documentsByCountries) && kotlin.jvm.internal.f.b(this.phoneCountryCodeWithMasks, iVar.phoneCountryCodeWithMasks) && kotlin.jvm.internal.f.b(this.tinCountryInfo, iVar.tinCountryInfo) && kotlin.jvm.internal.f.b(this.initMetadata, iVar.initMetadata) && kotlin.jvm.internal.f.b(this.eKycConfig, iVar.eKycConfig) && kotlin.jvm.internal.f.b(this.verificationUrl, iVar.verificationUrl) && kotlin.jvm.internal.f.b(this.accessToken, iVar.accessToken);
    }

    public final Map<String, String> f() {
        return this.initMetadata;
    }

    public final com.sumsub.sns.internal.core.data.model.remote.a g() {
        return this.eKycConfig;
    }

    public final String h() {
        return this.verificationUrl;
    }

    public int hashCode() {
        Map<String, Object> map = this.uiConf;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.applicantId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FlowType flowType = this.flowType;
        int hashCode4 = (hashCode3 + (flowType == null ? 0 : flowType.hashCode())) * 31;
        String str3 = this.idDocSetType;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlowActionType flowActionType = this.actionType;
        int hashCode7 = (hashCode6 + (flowActionType == null ? 0 : flowActionType.hashCode())) * 31;
        String str5 = this.faceLivenessLic;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.facemapPublicKey;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<Object, Object> map2 = this.sdkDict;
        int hashCode10 = (hashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.documentsByCountries;
        int hashCode11 = (hashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, c> map4 = this.phoneCountryCodeWithMasks;
        int hashCode12 = (hashCode11 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, Object> map5 = this.tinCountryInfo;
        int hashCode13 = (hashCode12 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map<String, String> map6 = this.initMetadata;
        int hashCode14 = (hashCode13 + (map6 == null ? 0 : map6.hashCode())) * 31;
        com.sumsub.sns.internal.core.data.model.remote.a aVar = this.eKycConfig;
        int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str7 = this.verificationUrl;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accessToken;
        return hashCode16 + (str8 != null ? str8.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: j, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    public final String k() {
        return this.flowName;
    }

    public final FlowType l() {
        return this.flowType;
    }

    public final String m() {
        return this.idDocSetType;
    }

    /* renamed from: n, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: o, reason: from getter */
    public final FlowActionType getActionType() {
        return this.actionType;
    }

    public final String p() {
        return this.faceLivenessLic;
    }

    public final String q() {
        return this.facemapPublicKey;
    }

    public final String r() {
        return this.accessToken;
    }

    public final String t() {
        return this.actionId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteConfig(uiConf=");
        sb2.append(this.uiConf);
        sb2.append(", applicantId=");
        sb2.append(this.applicantId);
        sb2.append(", flowName=");
        sb2.append(this.flowName);
        sb2.append(", flowType=");
        sb2.append(this.flowType);
        sb2.append(", idDocSetType=");
        sb2.append(this.idDocSetType);
        sb2.append(", actionId=");
        sb2.append(this.actionId);
        sb2.append(", actionType=");
        sb2.append(this.actionType);
        sb2.append(", faceLivenessLic=");
        sb2.append(this.faceLivenessLic);
        sb2.append(", facemapPublicKey=");
        sb2.append(this.facemapPublicKey);
        sb2.append(", sdkDict=");
        sb2.append(this.sdkDict);
        sb2.append(", documentsByCountries=");
        sb2.append(this.documentsByCountries);
        sb2.append(", phoneCountryCodeWithMasks=");
        sb2.append(this.phoneCountryCodeWithMasks);
        sb2.append(", tinCountryInfo=");
        sb2.append(this.tinCountryInfo);
        sb2.append(", initMetadata=");
        sb2.append(this.initMetadata);
        sb2.append(", eKycConfig=");
        sb2.append(this.eKycConfig);
        sb2.append(", verificationUrl=");
        sb2.append(this.verificationUrl);
        sb2.append(", accessToken=");
        return v.q(sb2, this.accessToken, ')');
    }

    public final FlowActionType v() {
        return this.actionType;
    }

    public final String x() {
        return this.applicantId;
    }

    public final Map<String, Object> z() {
        return this.documentsByCountries;
    }

    public i(Map<String, ? extends Object> map, String str, String str2, FlowType flowType, String str3, String str4, FlowActionType flowActionType, String str5, String str6, Map<Object, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, c> map4, Map<String, ? extends Object> map5, Map<String, String> map6, com.sumsub.sns.internal.core.data.model.remote.a aVar, String str7, String str8) {
        this.uiConf = map;
        this.applicantId = str;
        this.flowName = str2;
        this.flowType = flowType;
        this.idDocSetType = str3;
        this.actionId = str4;
        this.actionType = flowActionType;
        this.faceLivenessLic = str5;
        this.facemapPublicKey = str6;
        this.sdkDict = map2;
        this.documentsByCountries = map3;
        this.phoneCountryCodeWithMasks = map4;
        this.tinCountryInfo = map5;
        this.initMetadata = map6;
        this.eKycConfig = aVar;
        this.verificationUrl = str7;
        this.accessToken = str8;
    }

    public final i a(Map<String, ? extends Object> uiConf, String applicantId, String flowName, FlowType flowType, String idDocSetType, String actionId, FlowActionType actionType, String faceLivenessLic, String facemapPublicKey, Map<Object, ? extends Object> sdkDict, Map<String, ? extends Object> documentsByCountries, Map<String, c> phoneCountryCodeWithMasks, Map<String, ? extends Object> tinCountryInfo, Map<String, String> initMetadata, com.sumsub.sns.internal.core.data.model.remote.a eKycConfig, String verificationUrl, String accessToken) {
        return new i(uiConf, applicantId, flowName, flowType, idDocSetType, actionId, actionType, faceLivenessLic, facemapPublicKey, sdkDict, documentsByCountries, phoneCountryCodeWithMasks, tinCountryInfo, initMetadata, eKycConfig, verificationUrl, accessToken);
    }

    public static final void a(i self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.uiConf != null) {
            output.e(serialDesc, 0, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.uiConf);
        }
        if (output.D() || self.applicantId != null) {
            output.e(serialDesc, 1, m0.f26414a, self.applicantId);
        }
        if (output.D() || self.flowName != null) {
            output.e(serialDesc, 2, m0.f26414a, self.flowName);
        }
        if (output.D() || self.flowType != null) {
            output.e(serialDesc, 3, FlowType$$serializer.INSTANCE, self.flowType);
        }
        if (output.D() || self.idDocSetType != null) {
            output.e(serialDesc, 4, m0.f26414a, self.idDocSetType);
        }
        if (output.D() || self.actionId != null) {
            output.e(serialDesc, 5, m0.f26414a, self.actionId);
        }
        if (output.D() || self.actionType != null) {
            output.e(serialDesc, 6, com.sumsub.sns.internal.core.data.serializer.b.f15824a, self.actionType);
        }
        if (output.D() || self.faceLivenessLic != null) {
            output.e(serialDesc, 7, m0.f26414a, self.faceLivenessLic);
        }
        if (output.D() || self.facemapPublicKey != null) {
            output.e(serialDesc, 8, m0.f26414a, self.facemapPublicKey);
        }
        output.e(serialDesc, 9, new K(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0]), new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.sdkDict);
        if (output.D() || self.documentsByCountries != null) {
            output.e(serialDesc, 10, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.documentsByCountries);
        }
        if (output.D() || self.phoneCountryCodeWithMasks != null) {
            output.e(serialDesc, 11, new K(m0.f26414a, c.a.f15581a), self.phoneCountryCodeWithMasks);
        }
        if (output.D() || self.tinCountryInfo != null) {
            output.e(serialDesc, 12, new K(m0.f26414a, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Object.class), new InterfaceC1078b[0])), self.tinCountryInfo);
        }
        if (output.D() || self.initMetadata != null) {
            m0 m0Var = m0.f26414a;
            output.e(serialDesc, 13, new K(m0Var, m0Var), self.initMetadata);
        }
        if (output.D() || self.eKycConfig != null) {
            output.e(serialDesc, 14, a.C0212a.f15571a, self.eKycConfig);
        }
        if (output.D() || self.verificationUrl != null) {
            output.e(serialDesc, 15, m0.f26414a, self.verificationUrl);
        }
        if (!output.D() && self.accessToken == null) {
            return;
        }
        output.e(serialDesc, 16, m0.f26414a, self.accessToken);
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void E() {
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ void I() {
    }

    public static /* synthetic */ void K() {
    }

    public static /* synthetic */ void M() {
    }

    public static /* synthetic */ void O() {
    }

    public static /* synthetic */ void Q() {
    }

    public static /* synthetic */ void S() {
    }

    public static /* synthetic */ void U() {
    }

    public static /* synthetic */ void W() {
    }

    public static /* synthetic */ void Y() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void y() {
    }

    public /* synthetic */ i(Map map, String str, String str2, FlowType flowType, String str3, String str4, FlowActionType flowActionType, String str5, String str6, Map map2, Map map3, Map map4, Map map5, Map map6, com.sumsub.sns.internal.core.data.model.remote.a aVar, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : flowType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : flowActionType, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, map2, (i & 1024) != 0 ? null : map3, (i & 2048) != 0 ? null : map4, (i & 4096) != 0 ? null : map5, (i & 8192) != 0 ? null : map6, (i & 16384) != 0 ? null : aVar, (32768 & i) != 0 ? null : str7, (i & 65536) != 0 ? null : str8);
    }
}
