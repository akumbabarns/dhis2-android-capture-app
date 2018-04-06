package com.dhis2.usescases.eventsWithoutRegistration.eventSummary;

import android.support.annotation.NonNull;

import com.dhis2.data.forms.FormSectionViewModel;
import com.dhis2.data.forms.dataentry.fields.FieldViewModel;
import com.dhis2.utils.Result;

import org.hisp.dhis.rules.models.RuleEffect;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Cristian E. on 02/11/2017.
 *
 */

public interface EventSummaryRepository {

    @NonNull
    Flowable<List<FormSectionViewModel>> programStageSections(String eventUid);

    @NonNull
    Flowable<List<FieldViewModel>> list(String sectionUid, String eventUid);

    @NonNull
    Flowable<Result<RuleEffect>> calculate();
}
