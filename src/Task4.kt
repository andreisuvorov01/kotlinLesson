// Библиотека для работы с геолокацией
// Файл: LocationLibrary.kt

class LocationService {
    // Проблема: кэш должен быть виден только внутри модуля библиотеки
    val locationCache = mutableMapOf<String, Pair<Double, Double>>()

    internal fun clearCache() { // internal - решение
        locationCache.clear()
    }

    fun getLocation(address: String): Pair<Double, Double> {
        // Логика получения локации
        return Pair(0.0, 0.0)
    }
}

// Другой модуль (приложение)
fun main() {
    val service = LocationService()

    // Должно быть недоступно:
    // service.clearCache() // ⚠️ Не должно компилироваться в другом модуле
    // service.locationCache.clear() // ⚠️ Не должно быть доступно
}