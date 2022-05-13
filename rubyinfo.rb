puts $:
require "rbconfig"
puts RbConfig::CONFIG.class

RbConfig::CONFIG.keys.each_with_index do |key, index|
   value = RbConfig::CONFIG[key]
   print "key: #{key}, value: #{value}, index: #{index}\n"
   # use key, value and index as desired
end

RbConfig::CONFIG.each_with_index do |(key, value), index|
   print "key: #{key}, value: #{value}, index: #{index}\n"
   # use key, value and index as desired
end

puts "done"


