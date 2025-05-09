package com.sumsub.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1172g;
import ra.C1190z;
import ra.H;
import ra.InterfaceC1162A;
import ra.O;

@InterfaceC1080d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bj\b\u0001\u0018\u0000 \u009e\u00012\u00020\u0001:\u000479\u009f\u0001B\u0081\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010*B\u0011\b\u0010\u0012\u0006\u0010+\u001a\u00020\u0000¢\u0006\u0004\b)\u0010,B\u0095\u0003\b\u0017\u0012\u0006\u0010-\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b)\u00100J(\u00107\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÇ\u0001¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010:\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010<R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010:\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010<R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010:\u0012\u0004\bG\u0010>\u001a\u0004\bF\u0010<R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010:\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010<R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010:\u0012\u0004\bM\u0010>\u001a\u0004\bL\u0010<R0\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bR\u0010>\u001a\u0004\b7\u0010P\"\u0004\b7\u0010QR*\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010S\u0012\u0004\bV\u0010>\u001a\u0004\b?\u0010T\"\u0004\b7\u0010UR*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b\\\u0010>\u001a\u0004\bY\u0010Z\"\u0004\b7\u0010[R*\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b]\u0010X\u0012\u0004\b_\u0010>\u001a\u0004\b^\u0010Z\"\u0004\b?\u0010[R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010>\u001a\u0004\bb\u0010cR*\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\be\u0010X\u0012\u0004\bg\u0010>\u001a\u0004\bf\u0010Z\"\u0004\bB\u0010[R*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bm\u0010>\u001a\u0004\bj\u0010k\"\u0004\bE\u0010lR*\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bn\u0010i\u0012\u0004\bp\u0010>\u001a\u0004\bo\u0010k\"\u0004\b?\u0010lR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bq\u0010i\u0012\u0004\bs\u0010>\u001a\u0004\br\u0010kR*\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010X\u0012\u0004\bu\u0010>\u001a\u0004\bt\u0010Z\"\u0004\b9\u0010[R*\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010i\u0012\u0004\bx\u0010>\u001a\u0004\bw\u0010k\"\u0004\bH\u0010lR*\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bo\u0010i\u0012\u0004\bz\u0010>\u001a\u0004\by\u0010k\"\u0004\bB\u0010lR*\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b{\u0010i\u0012\u0004\b|\u0010>\u001a\u0004\bn\u0010k\"\u0004\b9\u0010lR*\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\by\u0010i\u0012\u0004\b}\u0010>\u001a\u0004\be\u0010k\"\u0004\b7\u0010lR.\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b~\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010>\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0005\b?\u0010\u0082\u0001R/\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0084\u0001\u0010\u007f\u0012\u0005\b\u0086\u0001\u0010>\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001\"\u0005\b9\u0010\u0082\u0001R-\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0005\b\u0087\u0001\u0010S\u0012\u0005\b\u0089\u0001\u0010>\u001a\u0005\b\u0088\u0001\u0010T\"\u0004\b?\u0010UR/\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u008a\u0001\u0010\u007f\u0012\u0005\b\u008c\u0001\u0010>\u001a\u0006\b\u008b\u0001\u0010\u0081\u0001\"\u0005\b7\u0010\u0082\u0001R/\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u0012\u0005\b\u0091\u0001\u0010>\u001a\u0005\bK\u0010\u008f\u0001\"\u0005\b7\u0010\u0090\u0001R.\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0092\u0001\u0010:\u0012\u0005\b\u0095\u0001\u0010>\u001a\u0005\b\u0093\u0001\u0010<\"\u0005\bE\u0010\u0094\u0001R.\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0096\u0001\u0010:\u0012\u0005\b\u0097\u0001\u0010>\u001a\u0005\b\u0084\u0001\u0010<\"\u0005\b9\u0010\u0094\u0001R-\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b@\u0010:\u0012\u0005\b\u0098\u0001\u0010>\u001a\u0005\b\u008a\u0001\u0010<\"\u0005\b?\u0010\u0094\u0001R.\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0005\b\u0099\u0001\u0010:\u0012\u0005\b\u009a\u0001\u0010>\u001a\u0005\b\u0092\u0001\u0010<\"\u0005\bB\u0010\u0094\u0001R,\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\bj\u0010:\u0012\u0005\b\u009b\u0001\u0010>\u001a\u0004\b]\u0010<\"\u0005\b7\u0010\u0094\u0001R,\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0005\b\u009c\u0001\u0010S\u0012\u0005\b\u009d\u0001\u0010>\u001a\u0004\bE\u0010T\"\u0004\b9\u0010U¨\u0006 \u0001"}, d2 = {"Lcom/sumsub/sentry/Device;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "manufacturer", "brand", "family", "model", "modelId", "", "archs", "", "batteryLevel", "", "isCharging", "isOnline", "Lcom/sumsub/sentry/Device$DeviceOrientation;", "orientation", "isSimulator", "", "memorySize", "freeMemory", "usableMemory", "isLowMemory", "storageSize", "freeStorage", "externalStorageSize", "externalFreeStorage", "", "screenWidthPixels", "screenHeightPixels", "screenDensity", "screenDpi", "Ljava/util/Date;", "bootTime", "timezone", "id", "language", "locale", "connectionType", "batteryTemperature", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/Device$DeviceOrientation;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", Device.f13499a, "(Lcom/sumsub/sentry/Device;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sumsub/sentry/Device$DeviceOrientation;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/Device;Lqa/c;Lpa/f;)V", "b", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "getName$annotations", "()V", "c", "C", "getManufacturer$annotations", "d", "i", "getBrand$annotations", "e", "q", "getFamily$annotations", "f", "G", "getModel$annotations", "g", "I", "getModelId$annotations", "h", "[Ljava/lang/String;", "()[Ljava/lang/String;", "([Ljava/lang/String;)V", "getArchs$annotations", "Ljava/lang/Float;", "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", "getBatteryLevel$annotations", "j", "Ljava/lang/Boolean;", "c0", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "isCharging$annotations", "k", "g0", "isOnline$annotations", "l", "Lcom/sumsub/sentry/Device$DeviceOrientation;", "M", "()Lcom/sumsub/sentry/Device$DeviceOrientation;", "getOrientation$annotations", "m", "i0", "isSimulator$annotations", "n", "Ljava/lang/Long;", "E", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "getMemorySize$annotations", "o", "s", "getFreeMemory$annotations", "p", "a0", "getUsableMemory$annotations", "e0", "isLowMemory$annotations", "r", "W", "getStorageSize$annotations", "u", "getFreeStorage$annotations", "t", "getExternalStorageSize$annotations", "getExternalFreeStorage$annotations", "v", "Ljava/lang/Integer;", "U", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "getScreenWidthPixels$annotations", "w", "S", "getScreenHeightPixels$annotations", "x", "O", "getScreenDensity$annotations", "y", "Q", "getScreenDpi$annotations", "z", "Ljava/util/Date;", "()Ljava/util/Date;", "(Ljava/util/Date;)V", "getBootTime$annotations", "A", "Y", "(Ljava/lang/String;)V", "getTimezone$annotations", "B", "getId$annotations", "getLanguage$annotations", "D", "getLocale$annotations", "getConnectionType$annotations", "F", "getBatteryTemperature$annotations", "Companion", "DeviceOrientation", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Device {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public static final String f13499a = "device";

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public String timezone;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public String id;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public String language;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public String locale;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public String connectionType;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public Float batteryTemperature;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String manufacturer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String brand;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String family;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String model;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String modelId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String[] archs;

    /* renamed from: i, reason: from kotlin metadata */
    public Float batteryLevel;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Boolean isCharging;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Boolean isOnline;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final DeviceOrientation orientation;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Boolean isSimulator;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Long memorySize;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public Long freeMemory;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Long usableMemory;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Boolean isLowMemory;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Long storageSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Long freeStorage;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Long externalStorageSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Long externalFreeStorage;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Integer screenWidthPixels;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Integer screenHeightPixels;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Float screenDensity;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Integer screenDpi;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Date bootTime;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sumsub/sentry/Device$DeviceOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "PORTRAIT", "LANDSCAPE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE;


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public static final class a implements InterfaceC1162A<DeviceOrientation> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f13530a = new a();

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f13531b;

            static {
                EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sentry.Device.DeviceOrientation", 2);
                enumDescriptor.k("portrait", false);
                enumDescriptor.k("landscape", false);
                f13531b = enumDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DeviceOrientation deserialize(InterfaceC1144d interfaceC1144d) {
                return DeviceOrientation.values()[interfaceC1144d.i(getDescriptor())];
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[0];
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f13531b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return ra.a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, DeviceOrientation deviceOrientation) {
                interfaceC1145e.l(getDescriptor(), deviceOrientation.ordinal());
            }
        }

        /* renamed from: com.sumsub.sentry.Device$DeviceOrientation$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<DeviceOrientation> serializer() {
                return a.f13530a;
            }

            public Companion() {
            }
        }
    }

    public static final class a implements InterfaceC1162A<Device> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13532a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13533b;

        static {
            a aVar = new a();
            f13532a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.Device", aVar, 31);
            pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
            pluginGeneratedSerialDescriptor.k("manufacturer", true);
            pluginGeneratedSerialDescriptor.k("brand", true);
            pluginGeneratedSerialDescriptor.k("family", true);
            pluginGeneratedSerialDescriptor.k("model", true);
            pluginGeneratedSerialDescriptor.k("model_id", true);
            pluginGeneratedSerialDescriptor.k("archs", true);
            pluginGeneratedSerialDescriptor.k("battery_level", true);
            pluginGeneratedSerialDescriptor.k("charging", true);
            pluginGeneratedSerialDescriptor.k("online", true);
            pluginGeneratedSerialDescriptor.k("orientation", true);
            pluginGeneratedSerialDescriptor.k("simulator", true);
            pluginGeneratedSerialDescriptor.k("memory_size", true);
            pluginGeneratedSerialDescriptor.k("free_memory", true);
            pluginGeneratedSerialDescriptor.k("usable_memory", true);
            pluginGeneratedSerialDescriptor.k("low_memory", true);
            pluginGeneratedSerialDescriptor.k("storage_size", true);
            pluginGeneratedSerialDescriptor.k("free_storage", true);
            pluginGeneratedSerialDescriptor.k("external_storage_size", true);
            pluginGeneratedSerialDescriptor.k("external_free_storage", true);
            pluginGeneratedSerialDescriptor.k("screen_width_pixels", true);
            pluginGeneratedSerialDescriptor.k("screen_height_pixels", true);
            pluginGeneratedSerialDescriptor.k("screen_density", true);
            pluginGeneratedSerialDescriptor.k("screen_dpi", true);
            pluginGeneratedSerialDescriptor.k("boot_time", true);
            pluginGeneratedSerialDescriptor.k("timezone", true);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("language", true);
            pluginGeneratedSerialDescriptor.k("locale", true);
            pluginGeneratedSerialDescriptor.k("connection_type", true);
            pluginGeneratedSerialDescriptor.k("battery_temperature", true);
            f13533b = pluginGeneratedSerialDescriptor;
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r32v6 java.lang.Object), method size: 2044
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.sumsub.sentry.Device deserialize(qa.InterfaceC1144d r71) {
            /*
                Method dump skipped, instructions count: 2044
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.Device.a.deserialize(qa.d):com.sumsub.sentry.Device");
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            InterfaceC1078b<?> a10 = C1095a.a(m0Var);
            InterfaceC1078b<?> a11 = C1095a.a(m0Var);
            InterfaceC1078b<?> a12 = C1095a.a(m0Var);
            InterfaceC1078b<?> a13 = C1095a.a(m0Var);
            InterfaceC1078b<?> a14 = C1095a.a(m0Var);
            InterfaceC1078b<?> a15 = C1095a.a(m0Var);
            InterfaceC1078b<?> a16 = C1095a.a(new ra.g0(kotlin.jvm.internal.h.a(String.class), m0Var));
            C1190z c1190z = C1190z.f26457a;
            InterfaceC1078b<?> a17 = C1095a.a(c1190z);
            C1172g c1172g = C1172g.f26395a;
            InterfaceC1078b<?> a18 = C1095a.a(c1172g);
            InterfaceC1078b<?> a19 = C1095a.a(c1172g);
            InterfaceC1078b<?> a20 = C1095a.a(DeviceOrientation.a.f13530a);
            InterfaceC1078b<?> a21 = C1095a.a(c1172g);
            O o10 = O.f26364a;
            InterfaceC1078b<?> a22 = C1095a.a(o10);
            InterfaceC1078b<?> a23 = C1095a.a(o10);
            InterfaceC1078b<?> a24 = C1095a.a(o10);
            InterfaceC1078b<?> a25 = C1095a.a(c1172g);
            InterfaceC1078b<?> a26 = C1095a.a(o10);
            InterfaceC1078b<?> a27 = C1095a.a(o10);
            InterfaceC1078b<?> a28 = C1095a.a(o10);
            InterfaceC1078b<?> a29 = C1095a.a(o10);
            H h9 = H.f26353a;
            return new InterfaceC1078b[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, C1095a.a(h9), C1095a.a(h9), C1095a.a(c1190z), C1095a.a(h9), C1095a.a(new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Date.class), new InterfaceC1078b[0])), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(c1190z)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13533b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, Device device) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            Device.a(device, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.Device$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<Device> serializer() {
            return a.f13532a;
        }

        public Companion() {
        }
    }

    public Device() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, (Float) null, (Boolean) null, (Boolean) null, (DeviceOrientation) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Float) null, (Integer) null, (Date) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Float) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    public static final void a(Device self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.name != null) {
            output.e(serialDesc, 0, ra.m0.f26414a, self.name);
        }
        if (output.D() || self.manufacturer != null) {
            output.e(serialDesc, 1, ra.m0.f26414a, self.manufacturer);
        }
        if (output.D() || self.brand != null) {
            output.e(serialDesc, 2, ra.m0.f26414a, self.brand);
        }
        if (output.D() || self.family != null) {
            output.e(serialDesc, 3, ra.m0.f26414a, self.family);
        }
        if (output.D() || self.model != null) {
            output.e(serialDesc, 4, ra.m0.f26414a, self.model);
        }
        if (output.D() || self.modelId != null) {
            output.e(serialDesc, 5, ra.m0.f26414a, self.modelId);
        }
        if (output.D() || self.archs != null) {
            output.e(serialDesc, 6, new ra.g0(kotlin.jvm.internal.h.a(String.class), ra.m0.f26414a), self.archs);
        }
        if (output.D() || self.batteryLevel != null) {
            output.e(serialDesc, 7, C1190z.f26457a, self.batteryLevel);
        }
        if (output.D() || self.isCharging != null) {
            output.e(serialDesc, 8, C1172g.f26395a, self.isCharging);
        }
        if (output.D() || self.isOnline != null) {
            output.e(serialDesc, 9, C1172g.f26395a, self.isOnline);
        }
        if (output.D() || self.orientation != null) {
            output.e(serialDesc, 10, DeviceOrientation.a.f13530a, self.orientation);
        }
        if (output.D() || self.isSimulator != null) {
            output.e(serialDesc, 11, C1172g.f26395a, self.isSimulator);
        }
        if (output.D() || self.memorySize != null) {
            output.e(serialDesc, 12, O.f26364a, self.memorySize);
        }
        if (output.D() || self.freeMemory != null) {
            output.e(serialDesc, 13, O.f26364a, self.freeMemory);
        }
        if (output.D() || self.usableMemory != null) {
            output.e(serialDesc, 14, O.f26364a, self.usableMemory);
        }
        if (output.D() || self.isLowMemory != null) {
            output.e(serialDesc, 15, C1172g.f26395a, self.isLowMemory);
        }
        if (output.D() || self.storageSize != null) {
            output.e(serialDesc, 16, O.f26364a, self.storageSize);
        }
        if (output.D() || self.freeStorage != null) {
            output.e(serialDesc, 17, O.f26364a, self.freeStorage);
        }
        if (output.D() || self.externalStorageSize != null) {
            output.e(serialDesc, 18, O.f26364a, self.externalStorageSize);
        }
        if (output.D() || self.externalFreeStorage != null) {
            output.e(serialDesc, 19, O.f26364a, self.externalFreeStorage);
        }
        if (output.D() || self.screenWidthPixels != null) {
            output.e(serialDesc, 20, H.f26353a, self.screenWidthPixels);
        }
        if (output.D() || self.screenHeightPixels != null) {
            output.e(serialDesc, 21, H.f26353a, self.screenHeightPixels);
        }
        if (output.D() || self.screenDensity != null) {
            output.e(serialDesc, 22, C1190z.f26457a, self.screenDensity);
        }
        if (output.D() || self.screenDpi != null) {
            output.e(serialDesc, 23, H.f26353a, self.screenDpi);
        }
        if (output.D() || self.bootTime != null) {
            output.e(serialDesc, 24, new kotlinx.serialization.a(kotlin.jvm.internal.h.a(Date.class), new InterfaceC1078b[0]), self.bootTime);
        }
        if (output.D() || self.timezone != null) {
            output.e(serialDesc, 25, ra.m0.f26414a, self.timezone);
        }
        if (output.D() || self.id != null) {
            output.e(serialDesc, 26, ra.m0.f26414a, self.id);
        }
        if (output.D() || self.language != null) {
            output.e(serialDesc, 27, ra.m0.f26414a, self.language);
        }
        if (output.D() || self.locale != null) {
            output.e(serialDesc, 28, ra.m0.f26414a, self.locale);
        }
        if (output.D() || self.connectionType != null) {
            output.e(serialDesc, 29, ra.m0.f26414a, self.connectionType);
        }
        if (!output.D() && self.batteryTemperature == null) {
            return;
        }
        output.e(serialDesc, 30, C1190z.f26457a, self.batteryTemperature);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    /* renamed from: A, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: C, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: E, reason: from getter */
    public final Long getMemorySize() {
        return this.memorySize;
    }

    /* renamed from: G, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: I, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    /* renamed from: K, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: M, reason: from getter */
    public final DeviceOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: O, reason: from getter */
    public final Float getScreenDensity() {
        return this.screenDensity;
    }

    /* renamed from: Q, reason: from getter */
    public final Integer getScreenDpi() {
        return this.screenDpi;
    }

    /* renamed from: S, reason: from getter */
    public final Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    /* renamed from: U, reason: from getter */
    public final Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    /* renamed from: W, reason: from getter */
    public final Long getStorageSize() {
        return this.storageSize;
    }

    /* renamed from: Y, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* renamed from: a0, reason: from getter */
    public final Long getUsableMemory() {
        return this.usableMemory;
    }

    /* renamed from: c, reason: from getter */
    public final Float getBatteryLevel() {
        return this.batteryLevel;
    }

    /* renamed from: c0, reason: from getter */
    public final Boolean getIsCharging() {
        return this.isCharging;
    }

    public final void e(Long l10) {
        this.memorySize = l10;
    }

    /* renamed from: e0, reason: from getter */
    public final Boolean getIsLowMemory() {
        return this.isLowMemory;
    }

    /* renamed from: g, reason: from getter */
    public final Date getBootTime() {
        return this.bootTime;
    }

    /* renamed from: g0, reason: from getter */
    public final Boolean getIsOnline() {
        return this.isOnline;
    }

    /* renamed from: i, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: i0, reason: from getter */
    public final Boolean getIsSimulator() {
        return this.isSimulator;
    }

    /* renamed from: k, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    /* renamed from: m, reason: from getter */
    public final Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    /* renamed from: o, reason: from getter */
    public final Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    /* renamed from: q, reason: from getter */
    public final String getFamily() {
        return this.family;
    }

    /* renamed from: s, reason: from getter */
    public final Long getFreeMemory() {
        return this.freeMemory;
    }

    /* renamed from: u, reason: from getter */
    public final Long getFreeStorage() {
        return this.freeStorage;
    }

    /* renamed from: w, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: y, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public /* synthetic */ Device(int i, String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, Float f10, Boolean bool, Boolean bool2, DeviceOrientation deviceOrientation, Boolean bool3, Long l10, Long l11, Long l12, Boolean bool4, Long l13, Long l14, Long l15, Long l16, Integer num, Integer num2, Float f11, Integer num3, Date date, String str7, String str8, String str9, String str10, String str11, Float f12, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.manufacturer = null;
        } else {
            this.manufacturer = str2;
        }
        if ((i & 4) == 0) {
            this.brand = null;
        } else {
            this.brand = str3;
        }
        if ((i & 8) == 0) {
            this.family = null;
        } else {
            this.family = str4;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str5;
        }
        if ((i & 32) == 0) {
            this.modelId = null;
        } else {
            this.modelId = str6;
        }
        if ((i & 64) == 0) {
            this.archs = null;
        } else {
            this.archs = strArr;
        }
        if ((i & 128) == 0) {
            this.batteryLevel = null;
        } else {
            this.batteryLevel = f10;
        }
        if ((i & 256) == 0) {
            this.isCharging = null;
        } else {
            this.isCharging = bool;
        }
        if ((i & 512) == 0) {
            this.isOnline = null;
        } else {
            this.isOnline = bool2;
        }
        if ((i & 1024) == 0) {
            this.orientation = null;
        } else {
            this.orientation = deviceOrientation;
        }
        if ((i & 2048) == 0) {
            this.isSimulator = null;
        } else {
            this.isSimulator = bool3;
        }
        if ((i & 4096) == 0) {
            this.memorySize = null;
        } else {
            this.memorySize = l10;
        }
        if ((i & 8192) == 0) {
            this.freeMemory = null;
        } else {
            this.freeMemory = l11;
        }
        if ((i & 16384) == 0) {
            this.usableMemory = null;
        } else {
            this.usableMemory = l12;
        }
        if ((32768 & i) == 0) {
            this.isLowMemory = null;
        } else {
            this.isLowMemory = bool4;
        }
        if ((65536 & i) == 0) {
            this.storageSize = null;
        } else {
            this.storageSize = l13;
        }
        if ((131072 & i) == 0) {
            this.freeStorage = null;
        } else {
            this.freeStorage = l14;
        }
        if ((262144 & i) == 0) {
            this.externalStorageSize = null;
        } else {
            this.externalStorageSize = l15;
        }
        if ((524288 & i) == 0) {
            this.externalFreeStorage = null;
        } else {
            this.externalFreeStorage = l16;
        }
        if ((1048576 & i) == 0) {
            this.screenWidthPixels = null;
        } else {
            this.screenWidthPixels = num;
        }
        if ((2097152 & i) == 0) {
            this.screenHeightPixels = null;
        } else {
            this.screenHeightPixels = num2;
        }
        if ((4194304 & i) == 0) {
            this.screenDensity = null;
        } else {
            this.screenDensity = f11;
        }
        if ((8388608 & i) == 0) {
            this.screenDpi = null;
        } else {
            this.screenDpi = num3;
        }
        if ((16777216 & i) == 0) {
            this.bootTime = null;
        } else {
            this.bootTime = date;
        }
        if ((33554432 & i) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str7;
        }
        if ((67108864 & i) == 0) {
            this.id = null;
        } else {
            this.id = str8;
        }
        if ((134217728 & i) == 0) {
            this.language = null;
        } else {
            this.language = str9;
        }
        if ((268435456 & i) == 0) {
            this.locale = null;
        } else {
            this.locale = str10;
        }
        if ((536870912 & i) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str11;
        }
        if ((i & 1073741824) == 0) {
            this.batteryTemperature = null;
        } else {
            this.batteryTemperature = f12;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String[] getArchs() {
        return this.archs;
    }

    public final void b(Boolean bool) {
        this.isLowMemory = bool;
    }

    public final void c(Boolean bool) {
        this.isOnline = bool;
    }

    public final void d(Boolean bool) {
        this.isSimulator = bool;
    }

    public final void e(String str) {
        this.timezone = str;
    }

    public final void f(Long l10) {
        this.storageSize = l10;
    }

    public Device(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, Float f10, Boolean bool, Boolean bool2, DeviceOrientation deviceOrientation, Boolean bool3, Long l10, Long l11, Long l12, Boolean bool4, Long l13, Long l14, Long l15, Long l16, Integer num, Integer num2, Float f11, Integer num3, Date date, String str7, String str8, String str9, String str10, String str11, Float f12) {
        this.name = str;
        this.manufacturer = str2;
        this.brand = str3;
        this.family = str4;
        this.model = str5;
        this.modelId = str6;
        this.archs = strArr;
        this.batteryLevel = f10;
        this.isCharging = bool;
        this.isOnline = bool2;
        this.orientation = deviceOrientation;
        this.isSimulator = bool3;
        this.memorySize = l10;
        this.freeMemory = l11;
        this.usableMemory = l12;
        this.isLowMemory = bool4;
        this.storageSize = l13;
        this.freeStorage = l14;
        this.externalStorageSize = l15;
        this.externalFreeStorage = l16;
        this.screenWidthPixels = num;
        this.screenHeightPixels = num2;
        this.screenDensity = f11;
        this.screenDpi = num3;
        this.bootTime = date;
        this.timezone = str7;
        this.id = str8;
        this.language = str9;
        this.locale = str10;
        this.connectionType = str11;
        this.batteryTemperature = f12;
    }

    public final void a(String[] strArr) {
        this.archs = strArr;
    }

    public final void b(Long l10) {
        this.externalStorageSize = l10;
    }

    public final void c(Long l10) {
        this.freeMemory = l10;
    }

    public final void d(Long l10) {
        this.freeStorage = l10;
    }

    /* renamed from: e, reason: from getter */
    public final Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public final void a(Float f10) {
        this.batteryLevel = f10;
    }

    public final void b(Integer num) {
        this.screenHeightPixels = num;
    }

    public final void c(Integer num) {
        this.screenWidthPixels = num;
    }

    public final void d(String str) {
        this.locale = str;
    }

    public final void a(Boolean bool) {
        this.isCharging = bool;
    }

    public final void b(String str) {
        this.id = str;
    }

    public final void c(Float f10) {
        this.screenDensity = f10;
    }

    public final void a(Long l10) {
        this.externalFreeStorage = l10;
    }

    public final void b(Float f10) {
        this.batteryTemperature = f10;
    }

    public final void c(String str) {
        this.language = str;
    }

    public final void a(Integer num) {
        this.screenDpi = num;
    }

    public final void a(Date date) {
        this.bootTime = date;
    }

    public final void a(String str) {
        this.connectionType = str;
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ void F() {
    }

    public static /* synthetic */ void H() {
    }

    public static /* synthetic */ void J() {
    }

    public static /* synthetic */ void L() {
    }

    public static /* synthetic */ void N() {
    }

    public static /* synthetic */ void P() {
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void T() {
    }

    public static /* synthetic */ void V() {
    }

    public static /* synthetic */ void X() {
    }

    public static /* synthetic */ void Z() {
    }

    public static /* synthetic */ void b0() {
    }

    public static /* synthetic */ void d0() {
    }

    public static /* synthetic */ void f0() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void h0() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void j0() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void z() {
    }

    public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, Float f10, Boolean bool, Boolean bool2, DeviceOrientation deviceOrientation, Boolean bool3, Long l10, Long l11, Long l12, Boolean bool4, Long l13, Long l14, Long l15, Long l16, Integer num, Integer num2, Float f11, Integer num3, Date date, String str7, String str8, String str9, String str10, String str11, Float f12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : strArr, (i & 128) != 0 ? null : f10, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : deviceOrientation, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : l10, (i & 8192) != 0 ? null : l11, (i & 16384) != 0 ? null : l12, (i & 32768) != 0 ? null : bool4, (i & 65536) != 0 ? null : l13, (i & 131072) != 0 ? null : l14, (i & 262144) != 0 ? null : l15, (i & 524288) != 0 ? null : l16, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : num, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : num2, (i & 4194304) != 0 ? null : f11, (i & 8388608) != 0 ? null : num3, (i & 16777216) != 0 ? null : date, (i & 33554432) != 0 ? null : str7, (i & 67108864) != 0 ? null : str8, (i & 134217728) != 0 ? null : str9, (i & 268435456) != 0 ? null : str10, (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : str11, (i & 1073741824) != 0 ? null : f12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Device(com.sumsub.sentry.Device r37) {
        /*
            r36 = this;
            r0 = r37
            java.lang.String r1 = r0.name
            java.lang.String r2 = r0.manufacturer
            java.lang.String r3 = r0.brand
            java.lang.String r4 = r0.family
            java.lang.String r5 = r0.model
            java.lang.String r6 = r0.modelId
            java.lang.Boolean r9 = r0.isCharging
            java.lang.Boolean r10 = r0.isOnline
            com.sumsub.sentry.Device$DeviceOrientation r11 = r0.orientation
            java.lang.Boolean r12 = r0.isSimulator
            java.lang.Long r13 = r0.memorySize
            java.lang.Long r14 = r0.freeMemory
            java.lang.Long r15 = r0.usableMemory
            java.lang.Boolean r8 = r0.isLowMemory
            java.lang.Long r7 = r0.storageSize
            r16 = r15
            java.lang.Long r15 = r0.freeStorage
            r17 = r15
            java.lang.Long r15 = r0.externalStorageSize
            r18 = r15
            java.lang.Long r15 = r0.externalFreeStorage
            r19 = r15
            java.lang.Integer r15 = r0.screenWidthPixels
            r20 = r15
            java.lang.Integer r15 = r0.screenHeightPixels
            r21 = r15
            java.lang.Float r15 = r0.screenDensity
            r22 = r15
            java.lang.Integer r15 = r0.screenDpi
            r23 = r7
            java.util.Date r7 = r0.bootTime
            r24 = 0
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r7.clone()
            r25 = r8
            goto L4f
        L4b:
            r25 = r8
            r7 = r24
        L4f:
            boolean r8 = r7 instanceof java.util.Date
            if (r8 == 0) goto L58
            java.util.Date r7 = (java.util.Date) r7
            r26 = r7
            goto L5a
        L58:
            r26 = r24
        L5a:
            java.lang.String r8 = r0.id
            java.lang.String r7 = r0.connectionType
            r27 = r15
            java.lang.Float r15 = r0.batteryTemperature
            r29 = r8
            java.lang.Float r8 = r0.batteryLevel
            r30 = r7
            java.lang.String[] r7 = r0.archs
            if (r7 == 0) goto L75
            java.lang.Object r7 = r7.clone()
            java.lang.String[] r7 = (java.lang.String[]) r7
            r31 = r15
            goto L79
        L75:
            r31 = r15
            r7 = r24
        L79:
            java.lang.String r15 = r0.locale
            java.lang.String r0 = r0.timezone
            if (r0 == 0) goto L82
            r34 = r0
            goto L84
        L82:
            r34 = r24
        L84:
            r32 = 134217728(0x8000000, float:3.85186E-34)
            r33 = 0
            r28 = 0
            r0 = r36
            r24 = r25
            r35 = r15
            r25 = r22
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r17
            r15 = r16
            r16 = r24
            r17 = r23
            r23 = r25
            r24 = r27
            r25 = r26
            r26 = r34
            r27 = r29
            r29 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.Device.<init>(com.sumsub.sentry.Device):void");
    }
}
