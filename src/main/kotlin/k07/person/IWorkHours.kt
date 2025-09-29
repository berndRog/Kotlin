package k07.person

import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime

interface IWorkHours {
   // Abstract properties - implementing classes must provide storage
   val workEntries: MutableMap<LocalDate, Pair<LocalTime?, LocalTime?>>

   fun recordStart(date: LocalDate, time: LocalTime) {
      val current = workEntries[date]
      workEntries[date] = Pair(time, current?.second)
   }

   fun recordEnd(date: LocalDate, time: LocalTime) {
      val current = workEntries[date] ?: Pair(null, null)
      workEntries[date] = Pair(current.first, time)
   }

   fun getDailyHours(date: LocalDate): Double {
      val entry = workEntries[date] ?: return 0.0
      val start = entry.first ?: return 0.0
      val end = entry.second ?: return 0.0
      return Duration.between(start, end).toMinutes() / 60.0
   }
}