package com.sumsub.sns.camera.photo.presentation.document;

import O9.p;
import R0.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSDocBoundsCheckResultView;
import com.sumsub.sns.core.widget.SNSProgressBarView;
import com.sumsub.sns.core.widget.SNSSegmentedToggleView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.camera.photo.presentation.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.v;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import ia.InterfaceC0840h;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import u2.C1514c;
import y0.s;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0019\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0017\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\b\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u001f\u0010\r\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\r\u0010\u001dJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\r\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H\u0002¢\u0006\u0004\b\r\u0010#J\u0013\u0010\r\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b\r\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0004J!\u0010*\u001a\u00020\u00072\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J1\u0010\r\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\r\u00102J\u000f\u00103\u001a\u00020\u0016H\u0014¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b\b\u0010?J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010>\u001a\u00020@H\u0014¢\u0006\u0004\b\r\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0014¢\u0006\u0004\bB\u0010\u0004J#\u0010\b\u001a\u00020\u00072\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0094@ø\u0001\u0000¢\u0006\u0004\b\b\u0010GJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\r\u0010IJ\u0017\u0010K\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020JH\u0014¢\u0006\u0004\bK\u0010LR\u001b\u0010Q\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010V\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001d\u0010Y\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001d\u0010\\\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001d\u0010_\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b]\u0010S\u001a\u0004\b^\u0010UR\u001d\u0010d\u001a\u0004\u0018\u00010`8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\ba\u0010S\u001a\u0004\bb\u0010cR\u001d\u0010f\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\be\u0010S\u001a\u0004\be\u0010UR\u001d\u0010i\u001a\u0004\u0018\u00010g8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bT\u0010S\u001a\u0004\bR\u0010hR\u001d\u0010l\u001a\u0004\u0018\u00010g8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bj\u0010S\u001a\u0004\bk\u0010hR\u001d\u0010n\u001a\u0004\u0018\u00010g8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bm\u0010hR\u001d\u0010r\u001a\u0004\u0018\u00010o8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bp\u0010S\u001a\u0004\bM\u0010qR\u001d\u0010t\u001a\u0004\u0018\u00010o8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b[\u0010S\u001a\u0004\bs\u0010qR\u001d\u0010v\u001a\u0004\u0018\u00010\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bb\u0010S\u001a\u0004\bu\u0010UR\u001d\u0010z\u001a\u0004\u0018\u00010w8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bx\u0010S\u001a\u0004\ba\u0010yR\u001d\u0010}\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010S\u001a\u0004\b|\u0010qR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bB\u0010S\u001a\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010S\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0089\u0001\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010S\u001a\u0005\b\u0088\u0001\u0010qR \u0010\u008c\u0001\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010S\u001a\u0005\b\u008b\u0001\u0010qR\u001a\u0010\u008e\u0001\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b^\u0010\u008d\u0001R \u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010S\u001a\u0005\b\u0090\u0001\u0010UR \u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010S\u001a\u0005\b\u0093\u0001\u0010UR\u001f\u0010\u0096\u0001\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0019\u0010S\u001a\u0005\b\u0095\u0001\u0010qR\u0019\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R \u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010S\u001a\u0005\b\u009a\u0001\u0010UR \u0010¡\u0001\u001a\u00030\u009c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001e\u0010£\u0001\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0098\u0001\u001a\u0005\bj\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\u000f\n\u0006\b¤\u0001\u0010\u0098\u0001\u001a\u0005\b{\u0010¢\u0001R\u0019\u0010§\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0098\u0001R \u0010«\u0001\u001a\u00030¨\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b©\u0001\u0010N\u001a\u0006\b\u0097\u0001\u0010ª\u0001R\u001f\u0010®\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b|\u0010N\u001a\u0006\b©\u0001\u0010\u00ad\u0001R\u001a\u0010±\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010°\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010³\u0001R\u0018\u0010»\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010°\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010¿\u0001\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u007f\u0010\u0098\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010\u0098\u0001R\u0016\u0010Å\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u00104R\u0018\u0010Æ\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010hR\u0018\u0010È\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010hR\u0018\u0010É\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010hR\u0018\u0010Ê\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010hR\u0018\u0010Ë\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010hR\u0018\u0010Ì\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010hR\u001a\u0010Ï\u0001\u001a\u0005\u0018\u00010Í\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Î\u0001R\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010hR\u001a\u0010Ó\u0001\u001a\u0005\u0018\u00010Ñ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010Ò\u0001R\u0017\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bp\u0010UR\u0017\u0010×\u0001\u001a\u00020%8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R$\u0010Û\u0001\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b]\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018TX\u0094\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006à\u0001"}, d2 = {"Lcom/sumsub/sns/camera/photo/presentation/document/a;", "Lcom/sumsub/sns/camera/b;", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel;", "<init>", "()V", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$c;", "state", "LO9/p;", "b", "(Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$c;)V", "e", "c", "d", "a", "", "force", "(Z)V", "l0", "appear", "Landroid/view/View;", Promotion.ACTION_VIEW, "(ZLandroid/view/View;)V", "", "frameContainerHeight", "(I)I", "M", "width", "height", "Landroid/graphics/Bitmap;", "(II)Landroid/graphics/Bitmap;", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$j;", "event", "(Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$j;)V", "j0", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$h;", "(Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$h;)V", "", "", "(J)Ljava/lang/String;", "k0", "Lkotlin/Function0;", "finishCallback", "showPhotoMadeAnimation", "(Lca/a;)V", "", "scaleX", "scaleY", "Lcom/sumsub/sns/internal/ml/docdetector/a;", "detectionResult", "save", "(FFLcom/sumsub/sns/internal/ml/docdetector/a;Z)V", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX$c;", "(Lcom/sumsub/sns/internal/core/domain/camera/CameraX$c;)V", "F", "Landroidx/camera/core/ImageProxy;", "image", "Lcom/sumsub/sns/internal/core/domain/camera/c;", "exposure", "(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/domain/camera/c;LT9/a;)Ljava/lang/Object;", "peekHeight", "(I)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "q", "LO9/f;", "i0", "()Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel;", "viewModel", "r", "Lcom/sumsub/sns/internal/core/common/z;", "x", "()Landroid/view/View;", "rootView", "s", "z", "takePictureProgressView", "t", "B", "takePictureViewContainer", "u", "J", "takeGalleryView", "Lcom/sumsub/sns/core/widget/SNSToolbarView;", "v", "C", "()Lcom/sumsub/sns/core/widget/SNSToolbarView;", "toolbar", "w", "progressBar", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "helperTitle", "y", "o", "helperBrief", "p", "helperDetails", "Landroid/view/ViewGroup;", "A", "()Landroid/view/ViewGroup;", "helperDetailsFrame", "g0", "helperView", "m", "darkOverlay", "Landroidx/camera/view/PreviewView;", "D", "()Landroidx/camera/view/PreviewView;", "previewView", "E", "U", "container", "Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", "b0", "()Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", "docDetectionResultView", "Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground;", "G", "e0", "()Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground;", "frameWithBackground", "H", "W", "debugInfoView", "I", "V", "debugInfoRightView", "Landroid/view/ViewGroup;", "frameHintContainer", "K", "h0", "photoFrameContainerView", "L", "O", "autoCaptureHint", "Q", "autoManual", "N", "Z", "photoMadeAnimation", "getPhotoMadeIndicator", "photoMadeIndicator", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "P", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "()Z", "shouldShowFlash", "R", "isFrontFacingCamera", "S", "isAnimatingPopup", "Lcom/sumsub/sns/internal/ml/autocapture/a;", "T", "()Lcom/sumsub/sns/internal/ml/autocapture/a;", "autoCaptureConfig", "Ljava/text/DecimalFormat;", "()Ljava/text/DecimalFormat;", "confidenceDecimalFormat", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "photoToPreviewTransform", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "photoFrameRect", "Landroid/graphics/RectF;", "X", "Landroid/graphics/RectF;", "photoFrameOnPhotoRectF", "Y", "photoFrameOnPhotoRect", "previewToPhotoMatrix", "a0", "Landroid/graphics/Bitmap;", "frameBitmap", "showDebugInfo", "c0", "Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$c;", "currentCaptureState", "d0", "processingFrame", "cameraContentColor", "docBoundsConfView", "f0", "goodDocConfView", "debugText1Right", "debugText2Right", "debugText3Right", "frameHintText", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "frameHintIcon", "autoCaptureHintText", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;", "()Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;", "autoManualSwitch", "takePictureView", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "", "", "()Ljava/util/Map;", "permissionsPayload", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "l", "()Lcom/sumsub/sns/internal/core/domain/camera/CameraX$Mode;", "cameraMode", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.camera.b<SNSPhotoDocumentPickerViewModel> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f13896p;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final z helperDetailsFrame;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final z helperView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final z darkOverlay;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final z previewView;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final z container;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final z docDetectionResultView;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public final z frameWithBackground;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final z debugInfoView;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public final z debugInfoRightView;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public ViewGroup frameHintContainer;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public final z photoFrameContainerView;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public final z autoCaptureHint;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    public final z autoManual;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    public boolean photoMadeAnimation;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final z photoMadeIndicator;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    public final Screen screen;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public final boolean shouldShowFlash;

    /* renamed from: R, reason: from kotlin metadata */
    public final boolean isFrontFacingCamera;

    /* renamed from: S, reason: from kotlin metadata */
    public boolean isAnimatingPopup;

    /* renamed from: T, reason: from kotlin metadata */
    public final O9.f autoCaptureConfig;

    /* renamed from: U, reason: from kotlin metadata */
    public final O9.f confidenceDecimalFormat;

    /* renamed from: V, reason: from kotlin metadata */
    public Matrix photoToPreviewTransform;

    /* renamed from: W, reason: from kotlin metadata */
    public Rect photoFrameRect;

    /* renamed from: X, reason: from kotlin metadata */
    public final RectF photoFrameOnPhotoRectF;

    /* renamed from: Y, reason: from kotlin metadata */
    public final Rect photoFrameOnPhotoRect;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public final Matrix previewToPhotoMatrix;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public Bitmap frameBitmap;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public final boolean showDebugInfo;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public SNSPhotoDocumentPickerViewModel.c currentCaptureState;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public boolean processingFrame;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final z rootView;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final z takePictureProgressView;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final z takePictureViewContainer;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final z takeGalleryView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final z toolbar;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final z progressBar;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final z helperTitle;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final z helperBrief;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final z helperDetails;

    /* renamed from: com.sumsub.sns.camera.photo.presentation.document.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(boolean z10, DocumentType documentType, List<? extends IdentitySide> list, boolean z11, String str, DocCapture$PreferredMode docCapture$PreferredMode, boolean z12, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_SEAMLESS", z10);
            bundle.putString("EXTRA_DOCUMENT_TYPE", documentType.c());
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((IdentitySide) it.next()).getValue());
            }
            bundle.putStringArrayList("EXTRA_DOCUMENT_SIDES", new ArrayList<>(arrayList));
            bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", z11);
            bundle.putString("EXTRA_PREFER_AUTO_CAPTURE", docCapture$PreferredMode != null ? docCapture$PreferredMode.getValue() : null);
            bundle.putBoolean("EXTRA_IS_RETAKE", z12);
            if (str != null) {
                bundle.putString("EXTRA_ONLY_ID_DOC", str);
            }
            if (bVar != null) {
                bundle.putParcelable("EXTRA_PREV_QUALITY_RESULT", bVar);
            }
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.ml.autocapture.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13929a = new b();

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.ml.autocapture.a invoke() {
            return com.sumsub.sns.internal.ml.autocapture.a.f17588m.a();
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<DecimalFormat> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f13930a = new c();

        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DecimalFormat invoke() {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            return decimalFormat;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f13931a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f13932b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSPhotoDocumentPickerViewModel.c f13933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, a aVar, SNSPhotoDocumentPickerViewModel.c cVar) {
            super(0);
            this.f13931a = z10;
            this.f13932b = aVar;
            this.f13933c = cVar;
        }

        public final void a() {
            TextView P4;
            String str;
            if (this.f13931a && (P4 = this.f13932b.P()) != null) {
                SNSPhotoDocumentPickerViewModel.AutoCaptureHint f10 = this.f13933c.f();
                if (f10 == null || (str = f10.c()) == null) {
                    str = " ";
                }
                P4.setText(str);
            }
            TextView P10 = this.f13932b.P();
            if (P10 == null) {
                return;
            }
            P10.setVisibility(this.f13931a ? 0 : 8);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.j f13935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a.j jVar) {
            super(0);
            this.f13935b = jVar;
        }

        public final void a() {
            a.this.photoMadeAnimation = false;
            ((SNSPhotoDocumentPickerViewModel.i) this.f13935b).b().invoke();
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<p> {
        public f() {
            super(0);
        }

        public final void a() {
            View h02 = a.this.h0();
            if (h02 == null) {
                return;
            }
            h02.setVisibility(4);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.camera.photo.presentation.document.SNSPhotoDocumentPickerFragment$onFrameCaptured$2", f = "SNSPhotoDocumentPickerFragment.kt", l = {281}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f13937a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13938b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13939c;

        /* renamed from: d, reason: collision with root package name */
        public int f13940d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ImageProxy f13942f;

        /* renamed from: com.sumsub.sns.camera.photo.presentation.document.a$g$a, reason: collision with other inner class name */
        public static final class C0150a extends Lambda implements InterfaceC0650p<Integer, Integer, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f13943a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0150a(a aVar) {
                super(2);
                this.f13943a = aVar;
            }

            public final Bitmap a(int i, int i9) {
                return this.f13943a.a(i, i9);
            }

            @Override // ca.InterfaceC0650p
            public /* bridge */ /* synthetic */ Bitmap invoke(Integer num, Integer num2) {
                return a(num.intValue(), num2.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ImageProxy imageProxy, T9.a<? super g> aVar) {
            super(2, aVar);
            this.f13942f = imageProxy;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new g(this.f13942f, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            long j10;
            Bitmap bitmap;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f13940d;
            if (i == 0) {
                kotlin.b.b(obj);
                boolean b9 = kotlin.jvm.internal.f.b(a.this.getViewModel().K().getValue().i().e(), Boolean.TRUE);
                if (a.this.processingFrame) {
                    if (e0.f15081a.isDebug()) {
                        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "skipped frame", null, 4, null);
                    }
                    return p.f3034a;
                }
                a.this.processingFrame = true;
                long currentTimeMillis = System.currentTimeMillis();
                Bitmap a10 = v.a(this.f13942f, new C0150a(a.this));
                if (b9 && a.this.photoFrameRect != null) {
                    Matrix matrix = a.this.photoToPreviewTransform;
                    int width = a10.getWidth();
                    int height = a10.getHeight();
                    PreviewView v10 = a.this.v();
                    int width2 = v10 != null ? v10.getWidth() : 0;
                    PreviewView v11 = a.this.v();
                    v.a(matrix, width, height, width2, v11 != null ? v11.getHeight() : 0, 0, true);
                    a.this.photoToPreviewTransform.invert(a.this.previewToPhotoMatrix);
                    RectF rectF = a.this.photoFrameOnPhotoRectF;
                    Rect rect = a.this.photoFrameRect;
                    if (rect == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    rectF.set(rect);
                    a.this.previewToPhotoMatrix.mapRect(a.this.photoFrameOnPhotoRectF);
                    a.this.photoFrameOnPhotoRect.set((int) a.this.photoFrameOnPhotoRectF.left, (int) a.this.photoFrameOnPhotoRectF.top, (int) a.this.photoFrameOnPhotoRectF.right, (int) a.this.photoFrameOnPhotoRectF.bottom);
                }
                Context context = a.this.getContext();
                if (context != null) {
                    a aVar = a.this;
                    SNSPhotoDocumentPickerViewModel viewModel = aVar.getViewModel();
                    Rect rect2 = aVar.photoFrameOnPhotoRect;
                    this.f13938b = a10;
                    this.f13939c = context;
                    this.f13937a = currentTimeMillis;
                    this.f13940d = 1;
                    if (viewModel.a(context, a10, rect2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = context;
                } else {
                    obj2 = null;
                }
                j10 = currentTimeMillis;
                bitmap = a10;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f13937a;
                obj2 = (Context) this.f13939c;
                bitmap = (Bitmap) this.f13938b;
                kotlin.b.b(obj);
            }
            if (obj2 == null) {
                obj2 = SNSPhotoDocumentPickerViewModel.FrameHandleResult.RELEASED;
            }
            if (obj2 == SNSPhotoDocumentPickerViewModel.FrameHandleResult.RELEASED) {
                bitmap.recycle();
            }
            TextView Z10 = a.this.Z();
            if (Z10 != null) {
                com.sumsub.sns.internal.core.common.i.a(Z10, "frame handle: " + a.this.a(System.currentTimeMillis() - j10));
            }
            a.this.processingFrame = false;
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.camera.photo.presentation.document.SNSPhotoDocumentPickerFragment$onViewCreated$1", f = "SNSPhotoDocumentPickerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<SNSPhotoDocumentPickerViewModel.c, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13944a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13945b;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSPhotoDocumentPickerViewModel.c cVar, T9.a<? super p> aVar) {
            return ((h) create(cVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            h hVar = a.this.new h(aVar);
            hVar.f13945b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f13944a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            a.this.b((SNSPhotoDocumentPickerViewModel.c) this.f13945b);
            return p.f3034a;
        }
    }

    public static final class i implements SNSSegmentedToggleView.OnItemSelected {
        public i() {
        }

        @Override // com.sumsub.sns.core.widget.SNSSegmentedToggleView.OnItemSelected
        public void onSelected(int i) {
            a.this.getViewModel().c(i == 0);
            a.this.getAnalyticsDelegate().a(a.this.getScreenInternal(), a.this.getIdDocSetType(), Control.AutocaptureSegmentedControl, a.this.u());
        }
    }

    public static final class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13948a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f13949b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SizeF f13950c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f13951d;

        public j(View view, a aVar, SizeF sizeF, boolean z10) {
            this.f13948a = view;
            this.f13949b = aVar;
            this.f13950c = sizeF;
            this.f13951d = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SNSFrameViewWithBackground e02 = this.f13949b.e0();
            if (e02 != null) {
                e02.setFrameSize(this.f13950c);
            }
            SNSFrameViewWithBackground e03 = this.f13949b.e0();
            if (e03 != null) {
                e03.b();
            }
            this.f13949b.l0();
            this.f13949b.M();
            if (this.f13951d) {
                a aVar = this.f13949b;
                com.sumsub.sns.camera.a.a(aVar, true, aVar.h0(), null, 4, null);
            }
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13954a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f13954a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f13954a;
        }
    }

    public static final class m extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13955a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f13955a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f13955a.invoke();
        }
    }

    public static final class n extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f13956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(O9.f fVar) {
            super(0);
            this.f13956a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f13956a.getValue()).getViewModelStore();
        }
    }

    public static final class o extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13957a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f13958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f13957a = interfaceC0635a;
            this.f13958b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f13957a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f13958b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class q extends Lambda implements InterfaceC0635a<T> {
        public q() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.camera.photo.presentation.document.d(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "rootView", "getRootView()Landroid/view/View;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f13896p = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "takePictureProgressView", "getTakePictureProgressView()Landroid/view/View;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "takePictureViewContainer", "getTakePictureViewContainer()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "toolbar", "getToolbar()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "progressBar", "getProgressBar()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperTitle", "getHelperTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperBrief", "getHelperBrief()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperDetails", "getHelperDetails()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperDetailsFrame", "getHelperDetailsFrame()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "helperView", "getHelperView()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "darkOverlay", "getDarkOverlay()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "previewView", "getPreviewView()Landroidx/camera/view/PreviewView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "container", "getContainer()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "docDetectionResultView", "getDocDetectionResultView()Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "frameWithBackground", "getFrameWithBackground()Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "debugInfoView", "getDebugInfoView()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "debugInfoRightView", "getDebugInfoRightView()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "photoFrameContainerView", "getPhotoFrameContainerView()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "autoCaptureHint", "getAutoCaptureHint()Landroid/view/View;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "autoManual", "getAutoManual()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "photoMadeIndicator", "getPhotoMadeIndicator()Landroid/view/View;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        q qVar = new q();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new m(new l(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(SNSPhotoDocumentPickerViewModel.class), new n(b9), qVar, new o(null, b9));
        this.rootView = a0.a(this, R$id.sns_content);
        this.takePictureProgressView = a0.a(this, R$id.sns_primary_button_progress);
        this.takePictureViewContainer = a0.a(this, R$id.sns_primary_button);
        this.takeGalleryView = a0.a(this, R$id.sns_gallery);
        this.toolbar = a0.a(this, R$id.sns_toolbar);
        this.progressBar = a0.a(this, R$id.sns_picker_progress);
        this.helperTitle = a0.a(this, R$id.sns_helper_title);
        this.helperBrief = a0.a(this, R$id.sns_helper_brief);
        this.helperDetails = a0.a(this, R$id.sns_helper_details);
        this.helperDetailsFrame = a0.a(this, R$id.sns_helper_details_frame);
        this.helperView = a0.a(this, R$id.sns_helper);
        this.darkOverlay = a0.a(this, R$id.sns_dark_overlay);
        this.previewView = a0.a(this, R$id.sns_camera_preview);
        this.container = a0.a(this, R$id.sns_camera_preview_container);
        this.docDetectionResultView = a0.a(this, R$id.sns_doc_detection_result);
        this.frameWithBackground = a0.a(this, R$id.sns_frame_with_background);
        this.debugInfoView = a0.a(this, R$id.sns_debug_info);
        this.debugInfoRightView = a0.a(this, R$id.sns_debug_info_right);
        this.photoFrameContainerView = a0.a(this, R$id.sns_frame_container);
        this.autoCaptureHint = a0.a(this, R$id.sns_autocapture_hint);
        this.autoManual = a0.a(this, R$id.sns_auto_manual);
        this.photoMadeIndicator = a0.a(this, R$id.photo_made_indicator);
        this.screen = com.sumsub.sns.core.presentation.c.f14171a.a(this);
        this.shouldShowFlash = true;
        this.autoCaptureConfig = kotlin.a.a(b.f13929a);
        this.confidenceDecimalFormat = kotlin.a.a(c.f13930a);
        this.photoToPreviewTransform = new Matrix();
        this.photoFrameOnPhotoRectF = new RectF();
        this.photoFrameOnPhotoRect = new Rect();
        this.previewToPhotoMatrix = new Matrix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getPhotoMadeIndicator() {
        return this.photoMadeIndicator.a(this, f13896p[21]);
    }

    @Override // com.sumsub.sns.camera.a
    public View A() {
        View B10 = B();
        if (B10 != null) {
            return B10.findViewById(R$id.sns_button);
        }
        return null;
    }

    @Override // com.sumsub.sns.camera.a
    public View B() {
        return this.takePictureViewContainer.a(this, f13896p[2]);
    }

    @Override // com.sumsub.sns.camera.a
    public SNSToolbarView C() {
        return (SNSToolbarView) this.toolbar.a(this, f13896p[4]);
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: E, reason: from getter */
    public boolean getIsFrontFacingCamera() {
        return this.isFrontFacingCamera;
    }

    @Override // com.sumsub.sns.camera.a
    public void F() {
        getViewModel().P();
    }

    @Override // com.sumsub.sns.camera.b
    public View J() {
        return this.takeGalleryView.a(this, f13896p[3]);
    }

    public final void M() {
        Rect rect;
        RectF frameRect;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "configurePhotoFrameRect", null, 4, null);
        View h02 = h0();
        int top = h02 != null ? h02.getTop() : 0;
        SNSFrameViewWithBackground e02 = e0();
        if (e02 == null || (frameRect = e02.getFrameRect()) == null) {
            rect = null;
        } else {
            rect = new Rect((int) frameRect.left, ((int) frameRect.top) + top, (int) frameRect.right, top + ((int) frameRect.bottom));
            this.photoFrameOnPhotoRectF.set(rect);
        }
        this.photoFrameRect = rect;
    }

    public final com.sumsub.sns.internal.ml.autocapture.a N() {
        return (com.sumsub.sns.internal.ml.autocapture.a) this.autoCaptureConfig.getValue();
    }

    public final View O() {
        return this.autoCaptureHint.a(this, f13896p[19]);
    }

    public final TextView P() {
        View O6 = O();
        if (O6 instanceof TextView) {
            return (TextView) O6;
        }
        return null;
    }

    public final ViewGroup Q() {
        return (ViewGroup) this.autoManual.a(this, f13896p[20]);
    }

    public final SNSSegmentedToggleView R() {
        ViewGroup Q4 = Q();
        if (Q4 != null) {
            return (SNSSegmentedToggleView) Q4.findViewById(R$id.sns_auto_manual_switch);
        }
        return null;
    }

    public final int S() {
        View x9 = x();
        if (x9 != null) {
            return com.sumsub.sns.core.presentation.helper.a.f14273a.a(x9, SNSColorElement.CAMERA_CONTENT, C0913a.getColor(requireContext(), R$color.sns_camera_content));
        }
        return -1;
    }

    public final DecimalFormat T() {
        return (DecimalFormat) this.confidenceDecimalFormat.getValue();
    }

    public final ViewGroup U() {
        return (ViewGroup) this.container.a(this, f13896p[13]);
    }

    public final ViewGroup V() {
        return (ViewGroup) this.debugInfoRightView.a(this, f13896p[17]);
    }

    public final ViewGroup W() {
        return (ViewGroup) this.debugInfoView.a(this, f13896p[16]);
    }

    public final TextView X() {
        ViewGroup V = V();
        if (V != null) {
            return (TextView) V.findViewById(R$id.text1);
        }
        return null;
    }

    public final TextView Y() {
        ViewGroup V = V();
        if (V != null) {
            return (TextView) V.findViewById(R$id.text2);
        }
        return null;
    }

    public final TextView Z() {
        ViewGroup V = V();
        if (V != null) {
            return (TextView) V.findViewById(R$id.text3);
        }
        return null;
    }

    public final TextView a0() {
        ViewGroup W = W();
        if (W != null) {
            return (TextView) W.findViewById(R$id.sns_doc_bounds_confidence);
        }
        return null;
    }

    public final SNSDocBoundsCheckResultView b0() {
        return (SNSDocBoundsCheckResultView) this.docDetectionResultView.a(this, f13896p[14]);
    }

    public final ImageView c0() {
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            return (ImageView) viewGroup.findViewById(R$id.sns_icon);
        }
        return null;
    }

    public final TextView d0() {
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            return (TextView) viewGroup.findViewById(R$id.sns_text);
        }
        return null;
    }

    public final SNSFrameViewWithBackground e0() {
        return (SNSFrameViewWithBackground) this.frameWithBackground.a(this, f13896p[15]);
    }

    public final TextView f0() {
        ViewGroup W = W();
        if (W != null) {
            return (TextView) W.findViewById(R$id.sns_good_photo_confidence);
        }
        return null;
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public ViewGroup s() {
        return (ViewGroup) this.helperView.a(this, f13896p[10]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().u().c();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_document_picker;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    public final View h0() {
        return this.photoFrameContainerView.a(this, f13896p[18]);
    }

    @Override // com.sumsub.sns.camera.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        super.handleEvent(event);
        if (event instanceof SNSPhotoDocumentPickerViewModel.h) {
            SNSPhotoDocumentPickerViewModel.h hVar = (SNSPhotoDocumentPickerViewModel.h) event;
            float width = hVar.i().getWidth() / hVar.k().getWidth();
            float height = hVar.i().getHeight() / hVar.k().getHeight();
            a(hVar);
            if (hVar.g()) {
                a(width, height, hVar.j(), hVar.l());
                return;
            }
            return;
        }
        if (event instanceof SNSPhotoDocumentPickerViewModel.e) {
            j0();
            k0();
            return;
        }
        if (event instanceof SNSPhotoDocumentPickerViewModel.j) {
            a((SNSPhotoDocumentPickerViewModel.j) event);
            return;
        }
        if (!(event instanceof SNSPhotoDocumentPickerViewModel.i)) {
            if (event instanceof SNSPhotoDocumentPickerViewModel.g) {
                com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 100, null, 2, null);
            }
        } else {
            if (this.photoMadeAnimation) {
                return;
            }
            this.photoMadeAnimation = true;
            showPhotoMadeAnimation(new e(event));
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public SNSPhotoDocumentPickerViewModel getViewModel() {
        return (SNSPhotoDocumentPickerViewModel) this.viewModel.getValue();
    }

    public final void j0() {
        ViewGroup W = W();
        if (W != null) {
            W.setVisibility(8);
        }
        ViewGroup V = V();
        if (V != null) {
            V.setVisibility(8);
        }
        TextView a02 = a0();
        if (a02 != null) {
            com.sumsub.sns.internal.core.common.i.a(a02, (CharSequence) null);
        }
        TextView f02 = f0();
        if (f02 != null) {
            com.sumsub.sns.internal.core.common.i.a(f02, (CharSequence) null);
        }
    }

    public final void k0() {
        SNSDocBoundsCheckResultView b02 = b0();
        if (b02 == null) {
            return;
        }
        b02.setDocRect(null);
    }

    public final void l0() {
        RectF frameRect;
        Drawable background;
        SNSFrameViewWithBackground e02 = e0();
        if (e02 == null || (frameRect = e02.getFrameRect()) == null) {
            return;
        }
        ViewGroup viewGroup = this.frameHintContainer;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R$drawable.sns_round_rect_background);
        }
        ViewGroup viewGroup2 = this.frameHintContainer;
        if (viewGroup2 != null && (background = viewGroup2.getBackground()) != null) {
            com.sumsub.sns.internal.core.common.m.a(background, e02.getFrameBackgroundColor());
        }
        ViewGroup viewGroup3 = this.frameHintContainer;
        if (viewGroup3 != null) {
            viewGroup3.setLeft((int) frameRect.left);
        }
        ViewGroup viewGroup4 = this.frameHintContainer;
        if (viewGroup4 != null) {
            viewGroup4.setTop((int) frameRect.top);
        }
        ViewGroup viewGroup5 = this.frameHintContainer;
        if (viewGroup5 != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup5.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (int) frameRect.width();
            layoutParams.height = (int) frameRect.height();
            viewGroup5.setLayoutParams(layoutParams);
        }
    }

    @Override // com.sumsub.sns.camera.a
    public TextView o() {
        return (TextView) this.helperBrief.a(this, f13896p[7]);
    }

    @Override // com.sumsub.sns.camera.a, com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(com.sumsub.sns.internal.core.common.q finishReason) {
        boolean onFinishCalled = super.onFinishCalled(finishReason);
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "finishing photo screen: " + finishReason, null, 4, null);
        return onFinishCalled;
    }

    @Override // com.sumsub.sns.camera.b, com.sumsub.sns.camera.a, com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View h02 = h0();
        if (h02 != null) {
            h02.setVisibility(4);
        }
        b0.b(getViewModel().K(), this, new h(null));
        SNSSegmentedToggleView R = R();
        if (R != null) {
            com.sumsub.sns.internal.core.common.i.a(R, !getViewModel().D());
        }
        SNSSegmentedToggleView R2 = R();
        if (R2 != null) {
            R2.setOnItemSelected(new i());
        }
        View findViewById = requireView().findViewById(R$id.sns_save_frame);
        findViewById.setVisibility(8);
        findViewById.setOnClickListener(new J7.b(this, 9));
    }

    @Override // com.sumsub.sns.camera.a
    public TextView p() {
        return (TextView) this.helperDetails.a(this, f13896p[8]);
    }

    @Override // com.sumsub.sns.camera.a
    public TextView r() {
        return (TextView) this.helperTitle.a(this, f13896p[6]);
    }

    public final void showPhotoMadeAnimation(InterfaceC0635a<p> finishCallback) {
        View photoMadeIndicator = getPhotoMadeIndicator();
        if (photoMadeIndicator != null) {
            photoMadeIndicator.setVisibility(4);
        }
        View photoMadeIndicator2 = getPhotoMadeIndicator();
        if (photoMadeIndicator2 != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new k(finishCallback));
            photoMadeIndicator2.startAnimation(alphaAnimation);
        }
    }

    @Override // com.sumsub.sns.camera.a
    public Map<String, Object> u() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.u());
        Boolean h9 = getViewModel().K().getValue().i().h();
        if (h9 != null) {
            linkedHashMap.put("isAutocaptureEnabled", h9);
        }
        Boolean e10 = getViewModel().K().getValue().i().e();
        if (e10 != null) {
            linkedHashMap.put("isAutocaptureActive", e10);
        }
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.camera.a
    public PreviewView v() {
        return (PreviewView) this.previewView.a(this, f13896p[12]);
    }

    public View x() {
        return this.rootView.a(this, f13896p[0]);
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: y, reason: from getter */
    public boolean getShouldShowFlash() {
        return this.shouldShowFlash;
    }

    @Override // com.sumsub.sns.camera.a
    public View z() {
        return this.takePictureProgressView.a(this, f13896p[1]);
    }

    public static final void o(a aVar) {
        a(aVar, false, 1, (Object) null);
    }

    public final void c(SNSPhotoDocumentPickerViewModel.c state) {
        String d10;
        ImageView c02;
        SNSProgressBarView sNSProgressBarView;
        View requireView = requireView();
        int i9 = R$id.sns_popup_hint_container_background;
        View findViewById = requireView.findViewById(i9);
        if (findViewById != null && (sNSProgressBarView = (SNSProgressBarView) findViewById.findViewById(R$id.sns_progress)) != null) {
            SNSPhotoDocumentPickerViewModel.d h9 = state.h();
            sNSProgressBarView.setVisibility((h9 == null || !h9.e()) ? 8 : 0);
            sNSProgressBarView.setIndeterminateTintList(ColorStateList.valueOf(S()));
        }
        if (this.isAnimatingPopup) {
            return;
        }
        ViewGroup viewGroup = this.frameHintContainer;
        ViewGroup viewGroup2 = kotlin.jvm.internal.f.b(state.i().e(), Boolean.TRUE) ? (ViewGroup) requireView().findViewById(R$id.sns_frame_popup_hint_container) : (ViewGroup) requireView().findViewById(i9);
        this.frameHintContainer = viewGroup2;
        if (!kotlin.jvm.internal.f.b(viewGroup, viewGroup2) && viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (this.frameHintContainer == null) {
            return;
        }
        TextView d02 = d0();
        if (d02 != null) {
            SNSPhotoDocumentPickerViewModel.d h10 = state.h();
            com.sumsub.sns.internal.core.common.i.a(d02, h10 != null ? h10.f() : null);
        }
        TextView d03 = d0();
        if (d03 != null) {
            d03.setTextColor(S());
        }
        SNSPhotoDocumentPickerViewModel.d h11 = state.h();
        if (h11 != null && (d10 = h11.d()) != null && (c02 = c0()) != null) {
            c02.setImageDrawable(com.sumsub.sns.core.presentation.helper.a.f14273a.a(requireContext(), d10));
        }
        ImageView c03 = c0();
        if (c03 != null) {
            c03.setImageTintList(ColorStateList.valueOf(S()));
        }
        ViewGroup viewGroup3 = this.frameHintContainer;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(state.h() == null ? 8 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        r8 = com.sumsub.sns.camera.photo.presentation.document.b.b(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c r8) {
        /*
            r7 = this;
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c$a r0 = r8.i()
            java.lang.Boolean r1 = r0.e()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.f.b(r1, r2)
            r1 = r1 ^ 1
            com.sumsub.sns.core.widget.SNSSegmentedToggleView r3 = r7.R()
            if (r3 == 0) goto L3e
            java.lang.CharSequence r4 = r0.f()
            java.lang.String r5 = ""
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L25
        L24:
            r4 = r5
        L25:
            java.lang.CharSequence r6 = r0.g()
            if (r6 == 0) goto L33
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L32
            goto L33
        L32:
            r5 = r6
        L33:
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = P9.m.q(r4)
            r3.setItems(r4, r1)
        L3e:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c r1 = r7.currentCaptureState
            if (r1 == 0) goto L4d
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c$a r1 = r1.i()
            if (r1 == 0) goto L4d
            java.lang.Boolean r1 = r1.e()
            goto L4e
        L4d:
            r1 = 0
        L4e:
            java.lang.Boolean r3 = r0.h()
            boolean r3 = kotlin.jvm.internal.f.b(r3, r2)
            if (r3 == 0) goto L80
            java.lang.Boolean r3 = r0.e()
            boolean r3 = kotlin.jvm.internal.f.b(r3, r1)
            if (r3 != 0) goto L80
            java.lang.Boolean r3 = r0.e()
            boolean r3 = kotlin.jvm.internal.f.b(r3, r2)
            android.view.ViewGroup r4 = r7.Q()
            r7.a(r3, r4)
            java.lang.Boolean r3 = r0.e()
            boolean r3 = kotlin.jvm.internal.f.b(r3, r2)
            com.sumsub.sns.core.widget.SNSToolbarView r4 = r7.C()
            r7.a(r3, r4)
        L80:
            android.view.ViewGroup r3 = r7.Q()
            r4 = 0
            if (r3 != 0) goto L88
            goto L99
        L88:
            java.lang.Boolean r5 = r0.h()
            boolean r5 = kotlin.jvm.internal.f.b(r5, r2)
            if (r5 == 0) goto L94
            r5 = r4
            goto L96
        L94:
            r5 = 8
        L96:
            r3.setVisibility(r5)
        L99:
            android.view.View r3 = r7.O()
            if (r3 != 0) goto La0
            goto Lb2
        La0:
            java.lang.Boolean r5 = r0.e()
            boolean r5 = kotlin.jvm.internal.f.b(r5, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto Lae
            r5 = 4
            goto Laf
        Lae:
            r5 = r4
        Laf:
            r3.setVisibility(r5)
        Lb2:
            boolean r1 = kotlin.jvm.internal.f.b(r1, r2)
            if (r1 == 0) goto Ld0
            java.lang.Boolean r1 = r0.e()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.f.b(r1, r3)
            if (r1 == 0) goto Ld0
            android.view.View r1 = r7.h0()
            com.sumsub.sns.camera.photo.presentation.document.a$f r3 = new com.sumsub.sns.camera.photo.presentation.document.a$f
            r3.<init>()
            r7.a(r4, r1, r3)
        Ld0:
            java.lang.Boolean r0 = r0.e()
            boolean r0 = kotlin.jvm.internal.f.b(r0, r2)
            if (r0 == 0) goto Le9
            android.view.View r0 = r7.O()
            if (r0 == 0) goto Le9
            c.f r1 = new c.f
            r2 = 4
            r1.<init>(r7, r2)
            r0.post(r1)
        Le9:
            com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground r0 = r7.e0()
            if (r0 != 0) goto Lf0
            goto L107
        Lf0:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint r8 = r8.f()
            if (r8 == 0) goto L102
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State r8 = r8.d()
            if (r8 == 0) goto L102
            com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground$State r8 = com.sumsub.sns.camera.photo.presentation.document.b.a(r8)
            if (r8 != 0) goto L104
        L102:
            com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground$State r8 = com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground.State.RED
        L104:
            r0.setState(r8)
        L107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.camera.photo.presentation.document.a.d(com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c):void");
    }

    public final void e(SNSPhotoDocumentPickerViewModel.c state) {
        SNSPhotoDocumentPickerViewModel.c cVar;
        SNSPhotoDocumentPickerViewModel.k j10;
        File c2;
        SNSPhotoDocumentPickerViewModel.k j11;
        SNSPhotoDocumentPickerViewModel.k j12;
        SNSPhotoDocumentPickerViewModel.k j13 = state.j();
        if (j13 != null && (c2 = j13.c()) != null) {
            SNSPhotoDocumentPickerViewModel.c cVar2 = this.currentCaptureState;
            if (((cVar2 == null || (j12 = cVar2.j()) == null) ? null : j12.c()) != null || (j11 = state.j()) == null || !j11.d()) {
                c2 = null;
            }
            if (c2 != null) {
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "start video recording: " + getViewModel().v(), null, 4, null);
                d(c2);
            }
        }
        SNSPhotoDocumentPickerViewModel.k j14 = state.j();
        if (j14 == null || j14.d() || (cVar = this.currentCaptureState) == null || (j10 = cVar.j()) == null || !j10.d()) {
            return;
        }
        H();
    }

    @Override // com.sumsub.sns.camera.a
    /* renamed from: l */
    public CameraX.Mode getCameraMode() {
        return getViewModel().G();
    }

    @Override // com.sumsub.sns.camera.a
    public View m() {
        return this.darkOverlay.a(this, f13896p[11]);
    }

    @Override // com.sumsub.sns.camera.a
    public void b(File file) {
        getViewModel().b(file);
    }

    @Override // com.sumsub.sns.camera.a
    public Object b(ImageProxy imageProxy, com.sumsub.sns.internal.core.domain.camera.c cVar, T9.a<? super p> aVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new g(imageProxy, null), aVar);
        return withContext == CoroutineSingletons.f23158a ? withContext : p.f3034a;
    }

    public final void b(SNSPhotoDocumentPickerViewModel.c state) {
        View view;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "handleDocumentCaptureState: " + state, null, 4, null);
        e(state);
        d(state);
        a(state);
        c(state);
        a.d g10 = state.g();
        if (g10 != null && (view = getView()) != null) {
            view.post(new com.sumsub.sns.camera.photo.presentation.document.c(0, this, g10));
        }
        this.currentCaptureState = state;
    }

    public static final void a(a aVar, View view) {
        aVar.getViewModel().f(true);
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "saving the screen", null, 4, null);
    }

    @Override // com.sumsub.sns.camera.a
    public void a(CameraX.c file) {
        getViewModel().a(file);
    }

    public static final void a(a aVar, a.d dVar) {
        aVar.getBaseActivity().a(dVar.e(), dVar.f(), dVar.d());
    }

    public final int b(int frameContainerHeight) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_autocapture_hint_min_height);
        int dimensionPixelSize2 = (getResources().getDimensionPixelSize(R$dimen.sns_margin_medium) * 2) + getResources().getDimensionPixelSize(R$dimen.sns_autocapture_switch_min_height);
        BottomSheetBehavior<View> t3 = t();
        int peekHeight = t3 != null ? t3.getPeekHeight() : 0;
        ViewGroup U = U();
        int height = U != null ? U.getHeight() : 0;
        SNSToolbarView C10 = C();
        int height2 = ((height - (C10 != null ? C10.getHeight() : 0)) - frameContainerHeight) - peekHeight;
        int i9 = dimensionPixelSize + dimensionPixelSize2;
        if ((height2 < 0 ? 0 : height2) < i9) {
            return i9 - height2;
        }
        return 0;
    }

    public final void a(SNSPhotoDocumentPickerViewModel.c state) {
        TextView P4;
        String str;
        SNSPhotoDocumentPickerViewModel.c.a i9;
        SNSPhotoDocumentPickerViewModel.c cVar = this.currentCaptureState;
        Boolean e10 = (cVar == null || (i9 = cVar.i()) == null) ? null : i9.e();
        boolean z10 = state.f() == null || !kotlin.jvm.internal.f.b(state.i().e(), Boolean.TRUE);
        boolean z11 = !z10;
        if (!kotlin.jvm.internal.f.b(state.i().e(), e10)) {
            View O6 = O();
            if (O6 != null) {
                O6.setVisibility(z10 ? 8 : 0);
            }
            a(z11, O());
            a(z11, O(), new d(z11, this, state));
            return;
        }
        if (z11 && (P4 = P()) != null) {
            SNSPhotoDocumentPickerViewModel.AutoCaptureHint f10 = state.f();
            if (f10 == null || (str = f10.c()) == null) {
                str = " ";
            }
            P4.setText(str);
        }
        TextView P10 = P();
        if (P10 == null) {
            return;
        }
        P10.setVisibility(z11 ? 0 : 8);
    }

    @Override // com.sumsub.sns.camera.a
    public void a(int peekHeight) {
        if (kotlin.jvm.internal.f.b(getViewModel().K().getValue().i().e(), Boolean.TRUE)) {
            a(true);
        }
    }

    public static final class k implements Animation.AnimationListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a<p> f13953b;

        public k(InterfaceC0635a<p> interfaceC0635a) {
            this.f13953b = interfaceC0635a;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            View photoMadeIndicator = a.this.getPhotoMadeIndicator();
            if (photoMadeIndicator != null) {
                photoMadeIndicator.setVisibility(8);
            }
            InterfaceC0635a<p> interfaceC0635a = this.f13953b;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            View photoMadeIndicator = a.this.getPhotoMadeIndicator();
            if (photoMadeIndicator == null) {
                return;
            }
            photoMadeIndicator.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        aVar.a(z10);
    }

    public final void a(boolean force) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View h02 = h0();
        if (h02 == null || h02.getVisibility() != 0 || force) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "showPhotoFrame: " + force, null, 4, null);
            View h03 = h0();
            if (h03 == null || h03.getLayoutParams() == null) {
                return;
            }
            View h04 = h0();
            float width = h04 != null ? h04.getWidth() : 0;
            float applyDimension = TypedValue.applyDimension(5, 90.0f, requireContext().getResources().getDisplayMetrics());
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_small);
            float Q4 = (int) ha.h.Q(width - (getResources().getDimensionPixelSize(R$dimen.sns_margin_medium) * 2), applyDimension);
            int q10 = (int) (Q4 / N().q());
            int i9 = (dimensionPixelSize * 2) + q10;
            int b9 = b(i9);
            if (b9 != 0) {
                q10 -= b9;
                i9 -= b9;
                SNSSegmentedToggleView R = R();
                if (R != null && (layoutParams3 = R.getLayoutParams()) != null && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                }
            }
            SNSFrameViewWithBackground e02 = e0();
            if (e02 != null && (layoutParams2 = e02.getLayoutParams()) != null) {
                layoutParams2.width = (int) width;
                layoutParams2.height = i9;
                SNSFrameViewWithBackground e03 = e0();
                if (e03 != null) {
                    e03.setLayoutParams(layoutParams2);
                }
            }
            SizeF sizeF = new SizeF(Q4, q10);
            View h05 = h0();
            boolean z10 = (h05 == null || h05.getVisibility() == 0) ? false : true;
            SNSFrameViewWithBackground e04 = e0();
            if (e04 != null) {
                s.a(e04, new j(e04, this, sizeF, z10));
            }
            SNSFrameViewWithBackground e05 = e0();
            if (e05 != null) {
                e05.setFrameSize(sizeF);
            }
            SNSFrameViewWithBackground e06 = e0();
            if (e06 != null) {
                e06.b();
            }
            M();
            SNSFrameViewWithBackground e07 = e0();
            if (e07 != null) {
                e07.setState(SNSFrameViewWithBackground.State.RED);
            }
            View O6 = O();
            if (O6 != null) {
                View O8 = O();
                if (O8 == null || (layoutParams = O8.getLayoutParams()) == null) {
                    layoutParams = null;
                } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    BottomSheetBehavior<View> t3 = t();
                    marginLayoutParams.bottomMargin = t3 != null ? t3.getPeekHeight() : 0;
                    View O10 = O();
                    if (O10 != null) {
                        O10.setLayoutParams(layoutParams);
                    }
                }
                O6.setLayoutParams(layoutParams);
            }
            View h06 = h0();
            if (h06 == null) {
                return;
            }
            h06.setVisibility(getViewModel().D() ? 0 : 8);
        }
    }

    public final void a(boolean appear, View view) {
        int color = C0913a.getColor(requireContext(), R$color.sns_auto_capture_frame_background);
        SNSFrameViewWithBackground e02 = e0();
        if (e02 != null) {
            color = e02.getFrameBackgroundColor();
        }
        int i9 = 0;
        if (!appear) {
            i9 = color;
            color = 0;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new C1514c(), Integer.valueOf(i9), Integer.valueOf(color));
        ofObject.setDuration(n());
        ofObject.addUpdateListener(new A2.a(view, 2));
        ofObject.start();
    }

    public static final void a(View view, ValueAnimator valueAnimator) {
        if (view != null) {
            view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public final Bitmap a(int width, int height) {
        Bitmap bitmap = this.frameBitmap;
        if (bitmap != null && bitmap.getWidth() == width && bitmap.getHeight() == height && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmap2 = this.frameBitmap;
        if (bitmap2 != null) {
            if (!bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            this.frameBitmap = null;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "prepared frame bitmap " + createBitmap.getWidth() + 'x' + createBitmap.getHeight(), null, 4, null);
        Bitmap copy = createBitmap.copy(config, true);
        if (createBitmap != copy) {
            createBitmap.recycle();
        }
        this.frameBitmap = copy;
        return copy;
    }

    public final void a(SNSPhotoDocumentPickerViewModel.j event) {
        ViewGroup W = W();
        if (W != null) {
            W.setVisibility(this.showDebugInfo ? 0 : 8);
        }
        if (this.showDebugInfo) {
            String j10 = s3.b.j("Good doc conf: ", T().format(Float.valueOf(event.d())));
            TextView f02 = f0();
            if (f02 != null) {
                com.sumsub.sns.internal.core.common.i.a(f02, j10);
            }
            TextView Y = Y();
            if (Y != null) {
                com.sumsub.sns.internal.core.common.i.a(Y, "badphotos time " + a(event.f()));
            }
        }
    }

    public final void a(SNSPhotoDocumentPickerViewModel.h event) {
        ViewGroup V = V();
        if (V != null) {
            V.setVisibility(this.showDebugInfo ? 0 : 8);
        }
        if (this.showDebugInfo) {
            String j10 = s3.b.j("Doc bounds conf: ", T().format(Float.valueOf(event.j().h())));
            TextView a02 = a0();
            if (a02 != null) {
                com.sumsub.sns.internal.core.common.i.a(a02, j10);
            }
            ViewGroup W = W();
            if (W != null) {
                W.setVisibility(this.showDebugInfo ? 0 : 8);
            }
            TextView X = X();
            if (X != null) {
                com.sumsub.sns.internal.core.common.i.a(X, "auto cap time " + a(event.j().l()));
            }
        }
    }

    public final String a(long j10) {
        return j10 + " ms";
    }

    public final void a(float scaleX, float scaleY, com.sumsub.sns.internal.ml.docdetector.a detectionResult, boolean save) {
        Rect a10 = com.sumsub.sns.internal.camera.photo.presentation.document.c.a(detectionResult.m(), scaleX, scaleY);
        if (save) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "showDocumentFrameAndCheckPhotoFrame: " + a10, null, 4, null);
        }
        RectF rectF = new RectF(a10);
        this.photoToPreviewTransform.mapRect(rectF);
        if (save) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "showDocumentFrameAndCheckPhotoFrame: view rect=" + rectF, null, 4, null);
        }
        SNSDocBoundsCheckResultView b02 = b0();
        if (b02 == null) {
            return;
        }
        b02.setDocRectF(rectF);
    }
}
