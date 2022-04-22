package tj.politech.diplom.domain.test_list.repository

import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.test_list.entity.TestListEntity

interface TestListRepository {
    fun getTestListByRace(start: Int, end: Int): GenericResponseArrayList<TestListEntity>
}