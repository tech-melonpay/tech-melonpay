package com.sumsub.sns.videoident.presentation;

import O9.f;
import O9.p;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.videoident.presentation.SNSViewState;
import com.sumsub.sns.internal.videoident.presentation.a;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/LanguageSelectionFragment;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/videoident/presentation/a$c;", "Lcom/sumsub/sns/internal/videoident/presentation/a;", "<init>", "()V", "", "language", "", "waitTimeSec", "LO9/p;", "finishWithLanguage", "(Ljava/lang/String;J)V", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "handleState", "(Lcom/sumsub/sns/internal/videoident/presentation/a$c;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "viewModel$delegate", "LO9/f;", "getViewModel", "()Lcom/sumsub/sns/internal/videoident/presentation/a;", "viewModel", "idDocSetType", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "Landroid/widget/TextView;", "title$delegate", "Lcom/sumsub/sns/internal/core/common/z;", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter;", "adapter", "Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LanguageSelectionFragment extends com.sumsub.sns.core.presentation.b<a.c, com.sumsub.sns.internal.videoident.presentation.a> {
    static final /* synthetic */ InterfaceC0840h<Object>[] $$delegatedProperties = {new PropertyReference1Impl(LanguageSelectionFragment.class, MessageBundle.TITLE_ENTRY, "getTitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.p(h.f23186a, LanguageSelectionFragment.class, "list", "getList()Landroidx/recyclerview/widget/RecyclerView;", 0)};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String RESULT_KEY_SELECTED_LANGUAGE = "lang";
    private LanguageItemAdapter adapter;
    private final String idDocSetType;

    /* renamed from: list$delegate, reason: from kotlin metadata */
    private final z list;
    private final Screen screen;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final z title;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final f viewModel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/LanguageSelectionFragment$Companion;", "", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$b;", "state", "Lcom/sumsub/sns/videoident/presentation/LanguageSelectionFragment;", "getInstance", "", "RESULT_KEY_SELECTED_LANGUAGE", "Ljava/lang/String;", "<init>", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LanguageSelectionFragment getInstance(SNSViewState.b state) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("languages", new ArrayList<>(state.c()));
            bundle.putString(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, state.d());
            LanguageSelectionFragment languageSelectionFragment = new LanguageSelectionFragment();
            languageSelectionFragment.setArguments(bundle);
            return languageSelectionFragment;
        }

        private Companion() {
        }
    }

    public LanguageSelectionFragment() {
        InterfaceC0635a<T> interfaceC0635a = new InterfaceC0635a<T>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final T invoke() {
                com.sumsub.sns.internal.core.a serviceLocator;
                LanguageSelectionFragment languageSelectionFragment = LanguageSelectionFragment.this;
                Bundle arguments = languageSelectionFragment.getArguments();
                serviceLocator = LanguageSelectionFragment.this.getServiceLocator();
                return new com.sumsub.sns.internal.videoident.presentation.b(languageSelectionFragment, arguments, serviceLocator);
            }
        };
        final InterfaceC0635a<Fragment> interfaceC0635a2 = new InterfaceC0635a<Fragment>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new InterfaceC0635a<X>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final X invoke() {
                return (X) InterfaceC0635a.this.invoke();
            }
        });
        final InterfaceC0635a interfaceC0635a3 = null;
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.videoident.presentation.a.class), new InterfaceC0635a<W>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) f.this.getValue()).getViewModelStore();
            }
        }, interfaceC0635a, new InterfaceC0635a<R0.a>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final R0.a invoke() {
                R0.a aVar;
                InterfaceC0635a interfaceC0635a4 = InterfaceC0635a.this;
                if (interfaceC0635a4 != null && (aVar = (R0.a) interfaceC0635a4.invoke()) != null) {
                    return aVar;
                }
                X x9 = (X) b9.getValue();
                InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
                return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
            }
        });
        this.idDocSetType = DocumentType.f15253j;
        this.screen = Screen.VideoidentLangSelectorScreen;
        this.title = a0.a(this, R$id.sns_title);
        this.list = a0.a(this, R$id.sns_list);
    }

    private final void finishWithLanguage(String language, long waitTimeSec) {
        getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.ContinueButton, kotlin.collections.a.s(new Pair(RESULT_KEY_SELECTED_LANGUAGE, language), new Pair("waitTimeSec", Long.valueOf(waitTimeSec))));
        Bundle bundle = new Bundle();
        bundle.putString(RESULT_KEY_SELECTED_LANGUAGE, language);
        p pVar = p.f3034a;
        com.sumsub.sns.core.presentation.b.setResult$default(this, 0, bundle, 1, null);
    }

    private final RecyclerView getList() {
        return (RecyclerView) this.list.a(this, $$delegatedProperties[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.title.a(this, $$delegatedProperties[0]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_video_ident_language_selection;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (!(event instanceof a.b)) {
            super.handleEvent(event);
        } else {
            a.b bVar = (a.b) event;
            finishWithLanguage(bVar.c(), bVar.d());
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "LanguageSelectionFragment.onFinishCalled: " + finishReason, null, 4, null);
        super.onFinishCalled(finishReason);
        com.sumsub.sns.core.presentation.b.setResult$default(this, 0, null, 2, null);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView list = getList();
        if (list != null) {
            list.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        RecyclerView list2 = getList();
        if (list2 != null) {
            list2.addItemDecoration(new com.sumsub.sns.core.presentation.base.adapter.decorator.b(getResources().getDimensionPixelSize(R$dimen.sns_margin_small)));
        }
        RecyclerView list3 = getList();
        if (list3 == null) {
            return;
        }
        LanguageItemAdapter languageItemAdapter = new LanguageItemAdapter();
        this.adapter = languageItemAdapter;
        languageItemAdapter.setSelectionCallback(new InterfaceC0646l<a.c.b, p>() { // from class: com.sumsub.sns.videoident.presentation.LanguageSelectionFragment$onViewCreated$1$1
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(a.c.b bVar) {
                invoke2(bVar);
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(a.c.b bVar) {
                LanguageSelectionFragment.this.getAnalyticsDelegate().b(LanguageSelectionFragment.this.getScreen(), LanguageSelectionFragment.this.getIdDocSetType(), Control.ListItem, kotlin.collections.a.s(new Pair(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, String.valueOf(bVar.g())), new Pair("waitTimeSec", Long.valueOf(bVar.l()))));
                LanguageSelectionFragment.this.getViewModel().a(bVar);
            }
        });
        list3.setAdapter(languageItemAdapter);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public com.sumsub.sns.internal.videoident.presentation.a getViewModel() {
        return (com.sumsub.sns.internal.videoident.presentation.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleState(a.c state, Bundle savedInstanceState) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "lang selection state: " + state, null, 4, null);
        TextView title = getTitle();
        if (title != null) {
            i.a(title, state.d());
        }
        LanguageItemAdapter languageItemAdapter = this.adapter;
        (languageItemAdapter != null ? languageItemAdapter : null).setItems(state.c());
    }
}
