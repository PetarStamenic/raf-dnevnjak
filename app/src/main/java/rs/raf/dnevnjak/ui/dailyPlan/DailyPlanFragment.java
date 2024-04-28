package rs.raf.dnevnjak.ui.dailyPlan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import rs.raf.dnevnjak.databinding.FragmentDailyPlanBinding;

public class DailyPlanFragment extends Fragment {

    private FragmentDailyPlanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        System.out.println("poop");
        DailyPlanViewModel dailyPlanViewModel =
                new ViewModelProvider(this).get(DailyPlanViewModel.class);

        binding = FragmentDailyPlanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}