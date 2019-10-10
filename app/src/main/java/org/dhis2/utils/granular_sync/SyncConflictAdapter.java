package org.dhis2.utils.granular_sync;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.dhis2.R;
import org.dhis2.databinding.ItemSyncConflictBinding;

import java.util.List;

public class SyncConflictAdapter extends RecyclerView.Adapter<SyncConflictHolder> {

    private final List<StatusLogItem> conflicts;

    SyncConflictAdapter(List<StatusLogItem> conflictList) {
        this.conflicts = conflictList;
    }

    @NonNull
    @Override
    public SyncConflictHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSyncConflictBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_sync_conflict, parent, false);
        return new SyncConflictHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SyncConflictHolder holder, int position) {
        holder.bind(conflicts.get(position));
    }

    @Override
    public int getItemCount() {
        return conflicts.size();
    }

    void addItems(List<StatusLogItem> conflicts) {
        this.conflicts.clear();
        this.conflicts.addAll(conflicts);
        notifyDataSetChanged();
    }

    void addItem(StatusLogItem item){
        this.conflicts.add(item);
        notifyDataSetChanged();
    }

    void addAllItems(List<StatusLogItem> conflicts){
        this.conflicts.addAll(conflicts);
        notifyDataSetChanged();
    }
}