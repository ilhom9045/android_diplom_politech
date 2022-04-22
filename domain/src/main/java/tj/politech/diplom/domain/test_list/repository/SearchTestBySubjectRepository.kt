package tj.politech.diplom.domain.test_list.repository

import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.test_list.entity.TestListEntity

interface SearchTestBySubjectRepository {
    fun searchBySubject(subjectName: String): GenericResponseArrayList<TestListEntity>
}