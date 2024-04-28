package rs.raf.dnevnjak.ui.calendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import rs.raf.dnevnjak.R;
import rs.raf.dnevnjak.databinding.FragmentCalendarBinding;

public class CalendarFragment extends Fragment {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*
        CalendarViewModel calendarViewModel =
                new ViewModelProvider(this).get(CalendarViewModel.class);
        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        View root = recyclerView.getRootView();
        layoutManager = new GridLayoutManager(this.getContext(), 7);
        recyclerView.setLayoutManager(layoutManager);
        return root;
        */
        return this.getView();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}