package tj.politech.diplom.test_list.repository

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.test_list.entity.TestListEntity

interface SearchTestBySubjectRepository {
    fun searchBySubject(subjectName: String): GenericResponseArrayList<TestListEntity>
}