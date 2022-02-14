package tj.politech.diplom.repository.test_list

import retrofit2.http.Query
import tj.politech.diplom.repository.network.api.BaseApi
import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.test_list.entity.TestListEntity

interface TestListApi : BaseApi {
    fun searchBySubject(@Query("subject_name") subjectName: String): GenericResponseArrayList<TestListEntity>
    fun getTestByRace(
        @Query("start") start: Int,
        @Query("end") end: Int
    ): GenericResponseArrayList<TestListEntity>
}