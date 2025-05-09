package com.airbnb.epoxy;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;

/* compiled from: GroupModel.kt */
@EpoxyModelClass
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/GroupModel;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Lcom/airbnb/epoxy/ModelCollector;", "<init>", "()V", "", "layoutRes", "(I)V", "Lcom/airbnb/epoxy/EpoxyModel;", "model", "LO9/p;", ProductAction.ACTION_ADD, "(Lcom/airbnb/epoxy/EpoxyModel;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class GroupModel extends EpoxyModelGroup implements ModelCollector {
    public GroupModel() {
    }

    @Override // com.airbnb.epoxy.ModelCollector
    public void add(EpoxyModel<?> model) {
        super.addModel(model);
    }

    public GroupModel(int i) {
        super(i);
    }
}
