package com.everychildsmilestone.app.ui;


import com.everychildsmilestone.app.R;
import com.everychildsmilestone.app.model.MaritalStatus;
import com.everychildsmilestone.app.model.person.Gender;
import com.everychildsmilestone.app.model.person.Person;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchPersonFragment extends android.support.v4.app.Fragment {

    public static SearchPersonFragment newInstance() {
        return new SearchPersonFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_search_person, container, false);
        rootview.findViewById(R.id.cancel_button)
                .setOnClickListener(v -> getActivity().onBackPressed());
        ListView listView = (ListView) rootview.findViewById(R.id.listview);
        SearchPersonAdapter adapter = new SearchPersonAdapter(getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) ->
                startActivity(new Intent(getActivity(), UserProfileActivity.class)));
        adapter.notifyDataSetChanged();
        return rootview;
    }

    public class SearchPersonAdapter extends ArrayAdapter<Person> {

        private ArrayList<Person> mPersons = new ArrayList<>();

        public SearchPersonAdapter(Context context) {
            super(context, R.layout.list_item_person);
            mPersons.add(new Person.Builder()
                    .mFirstName("Angela")
                    .mLastName("Smith")
                    .mId("1")
                    .mOccupation("Care Taker")
                    .mMobilePhoneNumber("1717888888")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.MARRIED)
                    .build());
            mPersons.add(new Person.Builder()
                    .mFirstName("Yerba")
                    .mLastName("Mate")
                    .mId("2")
                    .mMobilePhoneNumber("888888888")
                    .mOccupation("Driver")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.SINGLE)
                    .build());
            mPersons.add(new Person.Builder()
                    .mFirstName("Marget")
                    .mLastName("Molasses")
                    .mId("3")
                    .mOccupation("Seamstress")
                    .mMobilePhoneNumber("7777777777")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.OTHER)
                    .build());
            mPersons.add(new Person.Builder()
                    .mFirstName("Amy")
                    .mLastName("Chang")
                    .mId("4")
                    .mOccupation("Care Taker")
                    .mMobilePhoneNumber("1717888888")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.MARRIED)
                    .build());
            mPersons.add(new Person.Builder()
                    .mFirstName("Cassy")
                    .mLastName("Williams")
                    .mId("5")
                    .mMobilePhoneNumber("09876543")
                    .mOccupation("Librarian")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.MARRIED)
                    .build());
            mPersons.add(new Person.Builder()
                    .mFirstName("Mary")
                    .mLastName("Adams")
                    .mId("6")
                    .mOccupation("Clerk")
                    .mMobilePhoneNumber("12345678")
                    .mGender(Gender.FEMALE)
                    .mMaritalStatus(MaritalStatus.SINGLE)
                    .build());
            addAll(mPersons);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.list_item_person, null);
            }
            ((TextView) convertView.findViewById(R.id.firstname))
                    .setText(String.format("%s %s", getItem(position).getFirstName(),
                            getItem(position).getLastName()));
            ((TextView) convertView.findViewById(R.id.phonenumber))
                    .setText(getItem(position).getMobilePhoneNumber());
            ((TextView) convertView.findViewById(R.id.maritalstatus))
                    .setText(getItem(position).getMaritalStatus().toString());
            ((TextView) convertView.findViewById(R.id.gender))
                    .setText(getItem(position).getGender().toString());
            return convertView;
        }

    }
}
