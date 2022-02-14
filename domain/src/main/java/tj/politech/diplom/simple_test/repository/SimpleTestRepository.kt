package tj.politech.diplom.simple_test.repository

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.simple_test.entity.SimpleTestEntity

interface SimpleTestRepository {
    fun getSimpleTest(subjectId: Int, count: Int): GenericResponseArrayList<SimpleTestEntity>
}