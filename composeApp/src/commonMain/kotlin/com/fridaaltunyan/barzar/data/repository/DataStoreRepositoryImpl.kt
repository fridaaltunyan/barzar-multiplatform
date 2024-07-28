package com.fridaaltunyan.barzar.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.fridaaltunyan.barzar.domain.repository.DataStoreRepository
import kotlinx.coroutines.flow.first

class DataStoreRepositoryImpl(
    private val dataStore: DataStore<Preferences>,
) : DataStoreRepository {

    override suspend fun isFirstLaunch(): Boolean {
        val preferences = dataStore.data.first()
        return preferences[FIRST_LAUNCH] ?: true
    }

    override suspend fun setFirstLaunch(value: Boolean) {
        dataStore.edit { preferences ->
            preferences[FIRST_LAUNCH] = value
        }
    }

    companion object {
        val FIRST_LAUNCH = booleanPreferencesKey("first_launch")
    }
}