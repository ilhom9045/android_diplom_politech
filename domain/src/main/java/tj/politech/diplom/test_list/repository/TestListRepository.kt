package tj.politech.diplom.test_list.repository

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.test_list.entity.TestListEntity

interface TestListRepository {
    fun getTestListByRace(start: Int, end: Int): GenericResponseArrayList<TestListEntity>
}