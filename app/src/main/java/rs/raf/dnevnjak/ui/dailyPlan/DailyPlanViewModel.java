package rs.raf.dnevnjak.ui.dailyPlan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DailyPlanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DailyPlanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}