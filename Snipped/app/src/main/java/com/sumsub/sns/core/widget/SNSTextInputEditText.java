package com.sumsub.sns.core.widget;

import C.v;
import P9.l;
import P9.m;
import P9.n;
import P9.s;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\b\u0010*\u0001n\u0018\u0000 v2\u00020\u0001:\u0007wvxyz{|B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\r*\u0004\u0018\u00010$2\b\b\u0002\u0010.\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J)\u00106\u001a\u00020\r*\u000601j\u0002`22\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020!H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\rH\u0002¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020\r2\b\u0010A\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u00109J\u000f\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u00109J#\u0010F\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bF\u0010GJ#\u0010H\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010@J!\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020'2\b\u0010A\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR>\u0010X\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n0Uj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR>\u0010Z\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n0Uj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010[R\u001a\u0010\\\u001a\u000601j\u0002`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\u000601j\u0002`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010]R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010f\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR4\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u000e\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bk\u0010l\"\u0004\bm\u0010\u000fR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0011\u0010s\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010u\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bt\u0010#¨\u0006}"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "masks", "LO9/p;", "setMasksString", "(Ljava/util/List;)V", "setMasks", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "defaultInputType", "updateInputType", "(Ljava/lang/Integer;)V", "maxLength", "setMaxLength", "(I)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "isSuggestionsEnabled", "()Z", "Landroid/text/Editable;", "getText", "()Landroid/text/Editable;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "setError", "(Ljava/lang/CharSequence;)V", "s", "applyMask", "(Landroid/text/Editable;)V", "clear", "removeHintSpans", "(Landroid/text/Editable;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "char", "escaped", "appendMaskChar", "(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V", "cleanRaw", "()V", "findNewMask", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "start", "prevValidCharPosition", "(I)I", "getStartingPosition", "()I", "mask", "prepareMask", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V", "prepareMasks", "setDefaultMask", "getMaskSymbolsCount", "(ILjava/lang/String;)I", "getSpecialSymbolsInMaskedTextCount", "getRemovedSymbolsCount", TextBundle.TEXT_ENTRY, "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;", "maskMatches", "(Ljava/lang/CharSequence;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "maskListener", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "getMaskListener", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "setMaskListener", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;)V", "Ljava/util/HashMap;", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "Lkotlin/collections/HashMap;", "masksCleared", "Ljava/util/HashMap;", "maskSymbolPositions", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "raw", "Ljava/lang/StringBuilder;", "lastRaw", "Ljava/lang/String;", "buffer", "maxRawLength", "I", "isTextChangingBefore", "Z", "isTextChangingAfter", "isSelectionChanging", "", "benchmark", "J", "value", "masksInternal", "Ljava/util/List;", "setMasksInternal", "com/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1", "textWatcher", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;", "getRawText", "()Ljava/lang/String;", "rawText", "getMasksEnabled", "masksEnabled", "Companion", "CharHolder", "EditableProxy", "Mask", "MaskListener", "MaskMatchResult", "MyInputConnectionWrapper", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSTextInputEditText extends TextInputEditText {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Character[] maskSymbols = {'#', '?', '*'};
    private long benchmark;
    private StringBuilder buffer;
    private boolean isSelectionChanging;
    private boolean isTextChangingAfter;
    private boolean isTextChangingBefore;
    private String lastRaw;
    private Mask mask;
    private MaskListener maskListener;
    private HashMap<String, List<CharHolder>> maskSymbolPositions;
    private HashMap<String, List<CharHolder>> masksCleared;
    private List<Mask> masksInternal;
    private int maxRawLength;
    private StringBuilder raw;
    private final SNSTextInputEditText$textWatcher$1 textWatcher;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "", "", "char", "", "pos", "", "escaped", "<init>", "(CIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "C", "getChar", "()C", "I", "getPos", "Z", "getEscaped", "()Z", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CharHolder {
        private final char char;
        private final boolean escaped;
        private final int pos;

        public CharHolder(char c2, int i, boolean z10) {
            this.char = c2;
            this.pos = i;
            this.escaped = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CharHolder)) {
                return false;
            }
            CharHolder charHolder = (CharHolder) other;
            return this.char == charHolder.char && this.pos == charHolder.pos && this.escaped == charHolder.escaped;
        }

        public final char getChar() {
            return this.char;
        }

        public final boolean getEscaped() {
            return this.escaped;
        }

        public final int getPos() {
            return this.pos;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int b9 = v.b(this.pos, Character.hashCode(this.char) * 31, 31);
            boolean z10 = this.escaped;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return b9 + i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharHolder(char=");
            sb2.append(this.char);
            sb2.append(", pos=");
            sb2.append(this.pos);
            sb2.append(", escaped=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.escaped, ')');
        }

        public /* synthetic */ CharHolder(char c2, int i, boolean z10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(c2, (i9 & 2) != 0 ? -1 : i, (i9 & 4) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u001f\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0010J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\n*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;", "", "()V", "LOG_TAG", "", "maskSymbols", "", "", "[Ljava/lang/Character;", "isCharMaskPart", "", "symbol", "maskCharToPlaceholder", "modifyCharRegister", "maskChar", "char", "(Ljava/lang/Character;C)C", "symbolMatches", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "softMatch", "isUpperCaseMaskChar", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCharMaskPart(char symbol) {
            return l.n(SNSTextInputEditText.maskSymbols, Character.valueOf(symbol)) || Character.isLetterOrDigit(symbol);
        }

        private final boolean isUpperCaseMaskChar(char c2) {
            return c2 == '?' || c2 == '*' || Character.isUpperCase(c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char maskCharToPlaceholder(char symbol) {
            if (symbol == '#') {
                return '0';
            }
            if (symbol == '?' || symbol == '*') {
                return 'A';
            }
            return symbol;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char modifyCharRegister(Character maskChar, char r32) {
            return (maskChar == null || !isUpperCaseMaskChar(maskChar.charValue())) ? r32 : Character.toUpperCase(r32);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean symbolMatches(char r42, CharHolder maskChar, boolean softMatch) {
            boolean isLetter;
            if (maskChar.getEscaped()) {
                return j3.e.p(r42, maskChar.getChar(), true);
            }
            if (maskChar.getChar() == '#') {
                return Character.isDigit(r42);
            }
            if (maskChar.getChar() == '?') {
                return Character.isLetter(r42);
            }
            if (maskChar.getChar() == '*') {
                if (Character.isDigit(r42) || Character.isLetter(r42)) {
                    return true;
                }
            } else {
                if (!softMatch) {
                    return j3.e.p(r42, maskChar.getChar(), true);
                }
                if (j3.e.p(r42, maskChar.getChar(), true)) {
                    return true;
                }
                if (Character.isDigit(r42)) {
                    isLetter = Character.isDigit(maskChar.getChar());
                } else {
                    if (!Character.isLetter(r42)) {
                        return true;
                    }
                    isLetter = Character.isLetter(maskChar.getChar());
                }
                if (isLetter) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b\b\u0010\u000bJ8\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\b\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001e\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b#\u0010\"J \u0010$\u001a\u00020\f2\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b$\u0010\"J\u0084\u0001\u0010'\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u001c0\u001c\"\u0010\b\u0000\u0010%*\n \u0007*\u0004\u0018\u00010 0 2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2*\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00018\u00008\u0000\u0018\u00010&0&H\u0096\u0001¢\u0006\u0004\b'\u0010(J0\u0010)\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b)\u0010*J@\u0010)\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u000e\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b)\u0010+JH\u0010,\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2&\u0010\u000e\u001a\"\u0012\f\u0012\n \u0007*\u0004\u0018\u00010 0  \u0007*\u000b\u0012\u0002\b\u0003\u0018\u00010&¨\u0006\u00010&¨\u0006\u0001H\u0096\u0001¢\u0006\u0004\b,\u0010-J \u0010.\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0004\b.\u0010/J8\u00100\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\n0\nH\u0096\u0001¢\u0006\u0004\b0\u00101JH\u00100\u001a\n \u0007*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00102\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b0\u00103J>\u00104\u001a\u00020\u00102,\u0010\u0006\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b4\u00105J8\u00106\u001a\u00020\u00102\u000e\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010 0 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b6\u00107J \u0010:\u001a\u00020\n2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010FR\u0014\u0010H\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010A¨\u0006I"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$EditableProxy;", "Landroid/text/Editable;", "editable", "<init>", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V", "", "p0", "kotlin.jvm.PlatformType", "append", "(C)Landroid/text/Editable;", "", "(Ljava/lang/CharSequence;)Landroid/text/Editable;", "", "p1", "p2", "(Ljava/lang/CharSequence;II)Landroid/text/Editable;", "LO9/p;", "clearSpans", "()V", "delete", "(II)Landroid/text/Editable;", FirebaseAnalytics.Param.INDEX, "get", "(I)C", "", "p3", "getChars", "(II[CI)V", "", "Landroid/text/InputFilter;", "getFilters", "()[Landroid/text/InputFilter;", "", "getSpanEnd", "(Ljava/lang/Object;)I", "getSpanFlags", "getSpanStart", "T", "Ljava/lang/Class;", "getSpans", "(IILjava/lang/Class;)[Ljava/lang/Object;", "insert", "(ILjava/lang/CharSequence;)Landroid/text/Editable;", "(ILjava/lang/CharSequence;II)Landroid/text/Editable;", "nextSpanTransition", "(IILjava/lang/Class;)I", "removeSpan", "(Ljava/lang/Object;)V", "replace", "(IILjava/lang/CharSequence;)Landroid/text/Editable;", "p4", "(IILjava/lang/CharSequence;II)Landroid/text/Editable;", "setFilters", "([Landroid/text/InputFilter;)V", "setSpan", "(Ljava/lang/Object;III)V", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "clear", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/text/Editable;", "getLength", "length", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class EditableProxy implements Editable {
        private final Editable editable;

        public EditableProxy(Editable editable) {
            this.editable = editable;
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(char p02) {
            return this.editable.append(p02);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i) {
            return get(i);
        }

        @Override // android.text.Editable
        public void clear() {
            this.editable.clear();
            SNSTextInputEditText.this.raw.setLength(0);
            SNSTextInputEditText.this.setText("");
        }

        @Override // android.text.Editable
        public void clearSpans() {
            this.editable.clearSpans();
        }

        @Override // android.text.Editable
        public Editable delete(int p02, int p12) {
            return this.editable.delete(p02, p12);
        }

        public boolean equals(Object other) {
            return this.editable.equals(other);
        }

        public char get(int index) {
            return this.editable.charAt(index);
        }

        @Override // android.text.GetChars
        public void getChars(int p02, int p12, char[] p22, int p32) {
            this.editable.getChars(p02, p12, p22, p32);
        }

        @Override // android.text.Editable
        public InputFilter[] getFilters() {
            return this.editable.getFilters();
        }

        public int getLength() {
            return this.editable.length();
        }

        @Override // android.text.Spanned
        public int getSpanEnd(Object p02) {
            return this.editable.getSpanEnd(p02);
        }

        @Override // android.text.Spanned
        public int getSpanFlags(Object p02) {
            return this.editable.getSpanFlags(p02);
        }

        @Override // android.text.Spanned
        public int getSpanStart(Object p02) {
            return this.editable.getSpanStart(p02);
        }

        @Override // android.text.Spanned
        public <T> T[] getSpans(int p02, int p12, Class<T> p22) {
            return (T[]) this.editable.getSpans(p02, p12, p22);
        }

        public int hashCode() {
            return this.editable.hashCode();
        }

        @Override // android.text.Editable
        public Editable insert(int p02, CharSequence p12) {
            return this.editable.insert(p02, p12);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // android.text.Spanned
        public int nextSpanTransition(int p02, int p12, Class p22) {
            return this.editable.nextSpanTransition(p02, p12, p22);
        }

        @Override // android.text.Spannable
        public void removeSpan(Object p02) {
            this.editable.removeSpan(p02);
        }

        @Override // android.text.Editable
        public Editable replace(int p02, int p12, CharSequence p22) {
            return this.editable.replace(p02, p12, p22);
        }

        @Override // android.text.Editable
        public void setFilters(InputFilter[] p02) {
            this.editable.setFilters(p02);
        }

        @Override // android.text.Spannable
        public void setSpan(Object p02, int p12, int p22, int p32) {
            this.editable.setSpan(p02, p12, p22, p32);
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.editable.subSequence(startIndex, endIndex);
        }

        @Override // java.lang.CharSequence
        public String toString() {
            return this.editable.toString();
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p02) {
            return this.editable.append(p02);
        }

        @Override // android.text.Editable
        public Editable insert(int p02, CharSequence p12, int p22, int p32) {
            return this.editable.insert(p02, p12, p22, p32);
        }

        @Override // android.text.Editable
        public Editable replace(int p02, int p12, CharSequence p22, int p32, int p42) {
            return this.editable.replace(p02, p12, p22, p32, p42);
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p02, int p12, int p22) {
            return this.editable.append(p02, p12, p22);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "newMask", "LO9/p;", "onMaskChanged", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V", "", "raw", "", "preFilterMasks", "(Ljava/lang/CharSequence;)Ljava/util/List;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public interface MaskListener {
        void onMaskChanged(Mask newMask);

        default List<Mask> preFilterMasks(CharSequence raw) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;", "", "", "matches", "", "weight", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "mask", "<init>", "(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMatches", "()Z", "I", "getWeight", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "getMask", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class MaskMatchResult {
        private final Mask mask;
        private final boolean matches;
        private final int weight;

        public MaskMatchResult(boolean z10, int i, Mask mask) {
            this.matches = z10;
            this.weight = i;
            this.mask = mask;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaskMatchResult)) {
                return false;
            }
            MaskMatchResult maskMatchResult = (MaskMatchResult) other;
            return this.matches == maskMatchResult.matches && this.weight == maskMatchResult.weight && kotlin.jvm.internal.f.b(this.mask, maskMatchResult.mask);
        }

        public final Mask getMask() {
            return this.mask;
        }

        public final boolean getMatches() {
            return this.matches;
        }

        public final int getWeight() {
            return this.weight;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z10 = this.matches;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int b9 = v.b(this.weight, r02 * 31, 31);
            Mask mask = this.mask;
            return b9 + (mask == null ? 0 : mask.hashCode());
        }

        public String toString() {
            return "MaskMatchResult(matches=" + this.matches + ", weight=" + this.weight + ", mask=" + this.mask + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MyInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/view/inputmethod/InputConnection;Z)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class MyInputConnectionWrapper extends InputConnectionWrapper {
        public MyInputConnectionWrapper(InputConnection inputConnection, boolean z10) {
            super(inputConnection, z10);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            if (SNSTextInputEditText.this.raw.length() != 0) {
                return super.deleteSurroundingText(beforeLength, afterLength);
            }
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "SNSInputEditText", "Delete event return", null, 4, null);
            SNSTextInputEditText.this.setText((CharSequence) null);
            return true;
        }
    }

    public SNSTextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void appendMaskChar(StringBuilder sb2, Character ch, boolean z10) {
        if (ch == null) {
            return;
        }
        if (z10) {
            sb2.append(ch.charValue());
        } else {
            sb2.append(INSTANCE.maskCharToPlaceholder(ch.charValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMask(Editable s10) {
        int i;
        int i9;
        if (getMasksEnabled()) {
            if (this.mask == null) {
                if (s10 != null) {
                    removeHintSpans(s10, false);
                    return;
                }
                return;
            }
            this.buffer.setLength(0);
            if (s10 != null) {
                removeHintSpans$default(this, s10, false, 1, null);
            }
            HashMap<String, List<CharHolder>> hashMap = this.maskSymbolPositions;
            Mask mask = this.mask;
            List<CharHolder> list = hashMap.get(mask != null ? mask.getMask() : null);
            if (list != null) {
                i = 0;
                for (CharHolder charHolder : list) {
                    char c2 = charHolder.getChar();
                    if (charHolder.getPos() < 0) {
                        appendMaskChar(this.buffer, Character.valueOf(c2), charHolder.getEscaped());
                    } else if (charHolder.getPos() < this.raw.length()) {
                        this.buffer.append(INSTANCE.modifyCharRegister(Character.valueOf(c2), this.raw.charAt(charHolder.getPos())));
                        i++;
                    } else {
                        appendMaskChar(this.buffer, Character.valueOf(c2), charHolder.getEscaped());
                    }
                }
            } else {
                i = 0;
            }
            int length = this.raw.length();
            for (int i10 = i; i10 < length; i10++) {
                this.buffer.append(this.raw.charAt(i10));
            }
            if (s10 != null) {
                s10.append((CharSequence) this.buffer);
            }
            if (list != null) {
                Iterator<CharHolder> it = list.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (it.next().getPos() == i) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            i9 = -1;
            if (i9 < 0 || s10 == null) {
                return;
            }
            s10.setSpan(new ForegroundColorSpan(getCurrentHintTextColor()), i9, s10.length(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanRaw() {
        if (this.mask == null) {
            return;
        }
        StringBuilder sb2 = this.raw;
        StringBuilder sb3 = new StringBuilder();
        int length = sb2.length();
        for (int i = 0; i < length; i++) {
            char charAt = sb2.charAt(i);
            if (INSTANCE.isCharMaskPart(charAt)) {
                sb3.append(charAt);
            }
        }
        int i9 = this.maxRawLength;
        if (i9 < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested character count ", i9, " is less than zero.").toString());
        }
        int length2 = sb3.length();
        if (i9 > length2) {
            i9 = length2;
        }
        CharSequence subSequence = sb3.subSequence(0, i9);
        if (subSequence.length() != this.raw.length()) {
            this.raw.setLength(0);
            this.raw.append(subSequence);
        }
        if (this.raw.length() == 0) {
            setDefaultMask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Mask findNewMask() {
        List<Mask> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        MaskMatchResult maskMatchResult;
        Object next;
        Mask mask = this.mask;
        StringBuilder sb2 = this.raw;
        MaskListener maskListener = this.maskListener;
        if (maskListener == null || (list = maskListener.preFilterMasks(sb2)) == null) {
            list = this.masksInternal;
        }
        if (list != null) {
            arrayList = new ArrayList(n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(maskMatches(sb2, (Mask) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((MaskMatchResult) obj).getMatches()) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((MaskMatchResult) it2.next()).getWeight() != ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                        break;
                    }
                }
            }
            MaskMatchResult maskMatches = maskMatches(sb2, mask);
            if (maskMatches.getMatches() && maskMatches.getWeight() >= ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                return mask;
            }
        }
        if (arrayList2 != null) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int weight = ((MaskMatchResult) next).getWeight();
                    do {
                        Object next2 = it3.next();
                        int weight2 = ((MaskMatchResult) next2).getWeight();
                        if (weight < weight2) {
                            next = next2;
                            weight = weight2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            maskMatchResult = (MaskMatchResult) next;
        } else {
            maskMatchResult = null;
        }
        if (maskMatchResult != null) {
            return maskMatchResult.getMask();
        }
        return null;
    }

    private final int getMaskSymbolsCount(int maxLength, String mask) {
        List<CharHolder> list = this.maskSymbolPositions.get(mask);
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i9 = 0; i9 < size && i9 != maxLength; i9++) {
            if (list.get(i9).getPos() >= 0) {
                i++;
            }
        }
        return maxLength > i ? maxLength - getSpecialSymbolsInMaskedTextCount(maxLength, mask) : i;
    }

    public static /* synthetic */ int getMaskSymbolsCount$default(SNSTextInputEditText sNSTextInputEditText, int i, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            Mask mask = sNSTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return sNSTextInputEditText.getMaskSymbolsCount(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRemovedSymbolsCount() {
        return this.lastRaw.length() - this.raw.length();
    }

    private final int getSpecialSymbolsInMaskedTextCount(int maxLength, String mask) {
        List<CharHolder> list;
        if (maxLength <= 0 || (list = this.maskSymbolPositions.get(mask)) == null) {
            return 0;
        }
        int length = this.raw.length();
        int size = list.size();
        int i = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size && i10 != maxLength && i != length; i10++) {
            if (list.get(i10).getPos() < 0) {
                i9++;
            } else {
                i++;
            }
        }
        return i9;
    }

    public static /* synthetic */ int getSpecialSymbolsInMaskedTextCount$default(SNSTextInputEditText sNSTextInputEditText, int i, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            Mask mask = sNSTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return sNSTextInputEditText.getSpecialSymbolsInMaskedTextCount(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getStartingPosition() {
        HashMap<String, List<CharHolder>> hashMap = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = hashMap.get(mask != null ? mask.getMask() : null);
        if (list == null) {
            return 0;
        }
        Iterator<CharHolder> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getPos() >= 0) {
                break;
            }
            i++;
        }
        Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    private final MaskMatchResult maskMatches(CharSequence text, Mask mask) {
        if (mask == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        List<CharHolder> list = this.masksCleared.get(mask.getMask());
        if (list == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i >= text.length()) {
                return new MaskMatchResult(true, i9, mask);
            }
            char charAt = text.charAt(i);
            int i12 = i10 + 1;
            if (i10 >= list.size()) {
                return new MaskMatchResult(mask.getMaskValidIfOverflow(), i9, mask);
            }
            if (!INSTANCE.symbolMatches(charAt, list.get(i10), mask.getSoftMatch())) {
                return new MaskMatchResult(false, i9, mask);
            }
            if (j3.e.p(charAt, list.get(i10).getChar(), true)) {
                i11 = 4;
            } else if ((list.get(i10).getChar() == '#' && Character.isDigit(charAt)) || (list.get(i10).getChar() == '?' && Character.isLetter(charAt))) {
                i11 = 2;
            }
            i9 += i11;
            i++;
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareMask(Mask mask) {
        if (kotlin.jvm.internal.f.b(this.mask, mask)) {
            return;
        }
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, "SNSInputEditText", "prepareMask " + mask, null, 4, null);
        this.mask = mask;
        MaskListener maskListener = this.maskListener;
        if (maskListener != null) {
            maskListener.onMaskChanged(mask);
        }
    }

    private final void prepareMasks() {
        SNSTextInputEditText sNSTextInputEditText = this;
        List<Mask> list = sNSTextInputEditText.masksInternal;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                Mask mask = (Mask) obj;
                ArrayList arrayList = new ArrayList();
                sNSTextInputEditText.maskSymbolPositions.put(mask.getMask(), arrayList);
                ArrayList arrayList2 = new ArrayList();
                sNSTextInputEditText.masksCleared.put(mask.getMask(), arrayList2);
                String mask2 = mask.getMask();
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = 0; i11 < mask2.length(); i11++) {
                    char charAt = mask2.charAt(i11);
                    if (charAt != '\\' || z10) {
                        if (!INSTANCE.isCharMaskPart(charAt) || z10) {
                            arrayList.add(new CharHolder(charAt, -1, z10));
                            i10 = i10;
                        } else {
                            int i12 = i10;
                            arrayList2.add(new CharHolder(charAt, 0, z10, 2, null));
                            arrayList.add(new CharHolder(charAt, i12, z10));
                            i10 = i12 + 1;
                        }
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Mask " + mask + " cleared " + arrayList2, null, 4, null);
                sNSTextInputEditText = this;
                i = i9;
            }
        }
        setDefaultMask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int prevValidCharPosition(int start) {
        CharHolder charHolder;
        if (start < 0) {
            return 0;
        }
        HashMap<String, List<CharHolder>> hashMap = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = hashMap.get(mask != null ? mask.getMask() : null);
        return (list == null || (charHolder = (CharHolder) s.M(start, list)) == null) ? start - getSpecialSymbolsInMaskedTextCount$default(this, start, null, 2, null) : charHolder.getPos() < 0 ? prevValidCharPosition(start - 1) : charHolder.getPos();
    }

    private final void removeHintSpans(Editable editable, boolean z10) {
        if (editable == null) {
            return;
        }
        if (z10) {
            editable.clear();
        }
        for (Object obj : editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            editable.removeSpan((ForegroundColorSpan) obj);
        }
    }

    public static /* synthetic */ void removeHintSpans$default(SNSTextInputEditText sNSTextInputEditText, Editable editable, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = true;
        }
        sNSTextInputEditText.removeHintSpans(editable, z10);
    }

    private final void setDefaultMask() {
        List<Mask> list = this.masksInternal;
        Mask mask = null;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int length = ((Mask) obj).getMask().length();
                    do {
                        Object next = it.next();
                        int length2 = ((Mask) next).getMask().length();
                        if (length > length2) {
                            obj = next;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            mask = (Mask) obj;
        }
        prepareMask(mask);
    }

    private final void setMasksInternal(List<Mask> list) {
        this.masksInternal = list;
        if (list != null && (!list.isEmpty())) {
            updateInputType$default(this, null, 1, null);
        }
        prepareMasks();
    }

    public static /* synthetic */ void updateInputType$default(SNSTextInputEditText sNSTextInputEditText, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        sNSTextInputEditText.updateInputType(num);
    }

    public final MaskListener getMaskListener() {
        return this.maskListener;
    }

    public final boolean getMasksEnabled() {
        List<Mask> list = this.masksInternal;
        return list != null && (list.isEmpty() ^ true);
    }

    public final String getRawText() {
        return (!getMasksEnabled() || this.mask == null) ? String.valueOf(getText()) : this.raw.toString();
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        if (getMasksEnabled()) {
            return false;
        }
        return super.isSuggestionsEnabled();
    }

    @Override // com.google.android.material.textfield.TextInputEditText, m.C1009k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        if (!getMasksEnabled()) {
            return super.onCreateInputConnection(outAttrs);
        }
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new MyInputConnectionWrapper(onCreateInputConnection, true);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.isTextChangingAfter || this.isTextChangingBefore || this.isSelectionChanging || !getMasksEnabled()) {
            return;
        }
        super.onSelectionChanged(selStart, selEnd);
        HashMap<String, List<CharHolder>> hashMap = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = hashMap.get(mask != null ? mask.getMask() : null);
        if (list == null) {
            return;
        }
        int specialSymbolsInMaskedTextCount$default = getSpecialSymbolsInMaskedTextCount$default(this, selStart, null, 2, null) + this.raw.length();
        int specialSymbolsInMaskedTextCount$default2 = getSpecialSymbolsInMaskedTextCount$default(this, selEnd, null, 2, null) + this.raw.length();
        int startingPosition = getStartingPosition();
        int max = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default, selStart));
        int max2 = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default2, selEnd));
        while (max < list.size() && list.get(max).getPos() < 0) {
            max++;
        }
        while (max2 < list.size() && list.get(max2).getPos() < 0) {
            max2++;
        }
        this.isSelectionChanging = true;
        setSelection(max, max2);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        String a10 = com.sumsub.sns.internal.log.c.a(this);
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(selStart, selEnd, "onSelectionChanged, selStart=", ", selEnd=", ", start=");
        q10.append(max);
        q10.append(", end=");
        q10.append(max2);
        Logger.i$default(aVar, a10, q10.toString(), null, 4, null);
        this.isSelectionChanging = false;
    }

    @Override // android.widget.TextView
    public void setError(CharSequence error) {
        super.setError(error);
    }

    public final void setMaskListener(MaskListener maskListener) {
        this.maskListener = maskListener;
    }

    public final void setMasks(List<Mask> masks) {
        setMasksInternal(masks);
    }

    public final void setMasksString(List<String> masks) {
        ArrayList arrayList;
        if (masks != null) {
            arrayList = new ArrayList(n.u(masks, 10));
            Iterator<T> it = masks.iterator();
            while (it.hasNext()) {
                arrayList.add(new Mask((String) it.next(), false, false, false, null, 30, null));
            }
        } else {
            arrayList = null;
        }
        setMasksInternal(arrayList);
    }

    public final void setMaxLength(int maxLength) {
        this.maxRawLength = maxLength;
    }

    public final void updateInputType(Integer defaultInputType) {
        Typeface typeface = getTypeface();
        setInputType(defaultInputType != null ? 524432 | defaultInputType.intValue() : 524432);
        setFilters(new InputFilter[0]);
        setTypeface(typeface);
    }

    public /* synthetic */ SNSTextInputEditText(Context context, AttributeSet attributeSet, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R$attr.sns_TextInputEditTextStyle : i);
    }

    @Override // m.C1009k, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text = super.getText();
        return (!getMasksEnabled() || text == null) ? text : new EditableProxy(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.text.TextWatcher, com.sumsub.sns.core.widget.SNSTextInputEditText$textWatcher$1] */
    public SNSTextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.masksCleared = new HashMap<>();
        this.maskSymbolPositions = new HashMap<>();
        this.raw = new StringBuilder();
        this.lastRaw = "";
        this.buffer = new StringBuilder();
        this.maxRawLength = Integer.MAX_VALUE;
        ?? r12 = new TextWatcher() { // from class: com.sumsub.sns.core.widget.SNSTextInputEditText$textWatcher$1
            /* JADX WARN: Removed duplicated region for block: B:23:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x01da  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void afterTextChanged(android.text.Editable r15) {
                /*
                    Method dump skipped, instructions count: 525
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.SNSTextInputEditText$textWatcher$1.afterTextChanged(android.text.Editable):void");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
                boolean z10;
                if (SNSTextInputEditText.this.getMasksEnabled()) {
                    z10 = SNSTextInputEditText.this.isTextChangingAfter;
                    if (z10) {
                        return;
                    }
                    SNSTextInputEditText.this.benchmark = System.currentTimeMillis();
                    com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                    StringBuilder q10 = androidx.camera.core.impl.utils.a.q(start, count, "beforeTextChanged, start=", ", count=", ", after=");
                    q10.append(after);
                    q10.append(", s=");
                    q10.append((Object) s10);
                    Logger.v$default(aVar, "SNSInputEditText", q10.toString(), null, 4, null);
                    SNSTextInputEditText.this.isTextChangingBefore = true;
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s10, int start, int before, int count) {
                boolean z10;
                boolean z11;
                SNSTextInputEditText.Mask mask;
                int startingPosition;
                int prevValidCharPosition;
                CharSequence subSequence;
                if (SNSTextInputEditText.this.getMasksEnabled()) {
                    z10 = SNSTextInputEditText.this.isTextChangingBefore;
                    if (z10) {
                        z11 = SNSTextInputEditText.this.isTextChangingAfter;
                        if (z11) {
                            return;
                        }
                        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(start, before, "onTextChanged, start=", ", before=", ", count=");
                        q10.append(count);
                        q10.append(", s=");
                        q10.append((Object) s10);
                        Logger.v$default(aVar, "SNSInputEditText", q10.toString(), null, 4, null);
                        mask = SNSTextInputEditText.this.mask;
                        if (mask != null) {
                            SNSTextInputEditText sNSTextInputEditText = SNSTextInputEditText.this;
                            sNSTextInputEditText.lastRaw = sNSTextInputEditText.raw.toString();
                            if (count <= 0) {
                                startingPosition = SNSTextInputEditText.this.getStartingPosition();
                                if (start >= startingPosition) {
                                    prevValidCharPosition = SNSTextInputEditText.this.prevValidCharPosition(start);
                                    SNSTextInputEditText.this.raw.delete(prevValidCharPosition, Math.min(before + prevValidCharPosition, SNSTextInputEditText.this.raw.length()));
                                }
                            } else {
                                if (s10 == null || (subSequence = s10.subSequence(start, start + count)) == null) {
                                    return;
                                }
                                int maskSymbolsCount$default = SNSTextInputEditText.getMaskSymbolsCount$default(SNSTextInputEditText.this, start, null, 2, null);
                                StringBuilder q11 = androidx.camera.core.impl.utils.a.q(start, maskSymbolsCount$default, "onTextChanged, start=", ", rawStart=", ", addedText=");
                                q11.append((Object) subSequence);
                                Logger.v$default(aVar, "SNSInputEditText", q11.toString(), null, 4, null);
                                if (maskSymbolsCount$default > SNSTextInputEditText.this.raw.length()) {
                                    SNSTextInputEditText.this.raw.append(subSequence);
                                } else {
                                    int i9 = count + maskSymbolsCount$default;
                                    if (SNSTextInputEditText.this.raw.length() >= i9) {
                                        SNSTextInputEditText.this.raw.insert(maskSymbolsCount$default, subSequence);
                                    } else {
                                        SNSTextInputEditText.this.raw.replace(maskSymbolsCount$default, i9, subSequence.toString());
                                    }
                                }
                            }
                        } else {
                            SNSTextInputEditText.this.raw.setLength(0);
                            SNSTextInputEditText.this.raw.append(s10);
                        }
                        Logger.v$default(aVar, "SNSInputEditText", "onTextChanged, RawText = " + ((Object) SNSTextInputEditText.this.raw), null, 4, null);
                    }
                }
            }
        };
        this.textWatcher = r12;
        addTextChangedListener(r12);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "", "", "mask", "", "limitInputByLength", "maskValidIfOverflow", "softMatch", "payload", "<init>", "(Ljava/lang/String;ZZZLjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMask", "Z", "getLimitInputByLength", "()Z", "getMaskValidIfOverflow", "getSoftMatch", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Mask {
        private final boolean limitInputByLength;
        private final String mask;
        private final boolean maskValidIfOverflow;
        private final Object payload;
        private final boolean softMatch;

        public Mask(String str, boolean z10, boolean z11, boolean z12, Object obj) {
            this.mask = str;
            this.limitInputByLength = z10;
            this.maskValidIfOverflow = z11;
            this.softMatch = z12;
            this.payload = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mask)) {
                return false;
            }
            Mask mask = (Mask) other;
            return kotlin.jvm.internal.f.b(this.mask, mask.mask) && this.limitInputByLength == mask.limitInputByLength && this.maskValidIfOverflow == mask.maskValidIfOverflow && this.softMatch == mask.softMatch && kotlin.jvm.internal.f.b(this.payload, mask.payload);
        }

        public final String getMask() {
            return this.mask;
        }

        public final boolean getMaskValidIfOverflow() {
            return this.maskValidIfOverflow;
        }

        public final Object getPayload() {
            return this.payload;
        }

        public final boolean getSoftMatch() {
            return this.softMatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.mask.hashCode() * 31;
            boolean z10 = this.limitInputByLength;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode + i) * 31;
            boolean z11 = this.maskValidIfOverflow;
            int i10 = z11;
            if (z11 != 0) {
                i10 = 1;
            }
            int i11 = (i9 + i10) * 31;
            boolean z12 = this.softMatch;
            int i12 = (i11 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
            Object obj = this.payload;
            return i12 + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Mask(mask=" + this.mask + ", limitInputByLength=" + this.limitInputByLength + ", maskValidIfOverflow=" + this.maskValidIfOverflow + ", softMatch=" + this.softMatch + ", payload=" + this.payload + ')';
        }

        public /* synthetic */ Mask(String str, boolean z10, boolean z11, boolean z12, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z10, (i & 4) != 0 ? true : z11, (i & 8) != 0 ? true : z12, (i & 16) != 0 ? null : obj);
        }
    }
}
